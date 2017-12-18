package ru.sout;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.sout.pojo.*;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Анатолий on 06.02.2015.
 */
public class ServiceSpravImpl implements ServiceSprav {
    Logger logger = LogManager.getLogger(ServiceSpravImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<SprFactors> getFactors() {
        logger.info("getAllSprFactors");
        return sessionFactory.getCurrentSession().createQuery("select b from " + SprFactors.class.getName() + " b" +" where b.idprnt = 0").setReadOnly(true).list();
    }

    @Override
    @Transactional
    public List<SprSubFactors> getSubFactors() {
        logger.info("getAllSprSubFactors");
        return sessionFactory.getCurrentSession().createQuery("select b from " + SprSubFactors.class.getName() + " b ").setReadOnly(true).list();
    }

    @Override
    @Transactional
    public List<SprTemplates> getSprTemplates(){
        logger.info("getAllSprTemplates");
        return sessionFactory.getCurrentSession().createQuery("select b from " + SprTemplates.class.getName() + " b ").setReadOnly(true).list();
    }

    @Override
    @Transactional
    public List<VStructureMobileEntity> getWorkPlace(String token) {
        logger.info("getWorkPlaces");
//        return sessionFactory.getCurrentSession().createQuery("select b from " + VStructureMobileEntity.class.getName() + " b where b.jobsCode= ?" ).setString(0,token).setReadOnly(true).list();

//        String s  = (String) sessionFactory.getCurrentSession().createSQLQuery("select mkvProtocol.CalcWEClass(:params, null, 480) from dual")
//                .setParameter("params", token)
//                .uniqueResult();


        return  sessionFactory.getCurrentSession().createSQLQuery("select * from table(gsg.GSG_GETWORKPLACES_MOBILE('" + token + "'))")
                .addEntity(VStructureMobileEntity.class)
                //.setParameter("params", token)
                .list();

    }

    @Override
    @Transactional
    public List<FactorsValue> getValues(String token) {
        logger.info("-----getValues -----");
//        List<FactorsValue> ret = sessionFactory.getCurrentSession().createQuery("select b from " + VstructureFactorsValueEntity.class.getName() + " b where b.jobsCode= ?").setString(0, token).setReadOnly(true).list();

        List<FactorsValue> ret = sessionFactory.getCurrentSession().createSQLQuery("select * from table(gsg.GSG_GETFACTORS_VALUE('" + token + "'))")
                .addEntity(FactorsValue.class)
                .list();

        if (ret.size()>0){
            logger.info("-----markValues -----");
//            sessionFactory.getCurrentSession().createQuery("update Jobs b set b.idStatus = 16 where b.jobsCode = ? and b.idStatus = 15").setParameter(0, token).executeUpdate();
            sessionFactory.getCurrentSession().createQuery("update "+Jobs.class.getName()+" b set b.idStatus = 16 where b.jobsCode = ? and b.idStatus = 15").setParameter(0, token).executeUpdate();
        }
        logger.info("-----Ok -----");
        return ret; //sessionFactory.getCurrentSession().createQuery("select b from " + VstructureSubfactorsValueEntity.class.getName() + " b where b.jobsCode= ?").setString(0, token).setReadOnly(true).list();
    }

//    @Transactional
//    private void markJobs(String token){
//        sessionFactory.getCurrentSession().createQuery("update Jobs b set b.idStatus = 16 where b.jobsCode = ?").setString(0,token);
//    }


//    @Override
//    public String setValues(List<FactorsValue> data) {
//        String par = setValuesT1(data);
//        String ret = setValuesT2(par);
//        return ret;
//    }


//    @Override
//    @Transactional
//    public String setValues(List<FactorsValue> data) {
//        logger.info("------setValue------");
//        HashMap<BigDecimal,BigDecimal> m = new HashMap<BigDecimal,BigDecimal>();
//        String del = "";
//        String params = "";
//        for (FactorsValue item: data) {
//            if (!m.containsKey(item.getIdStructure())) {
//                params = params.concat(del).concat(item.getIdStructure().toString());
//                m.put(item.getIdStructure(),null);
//                del = ",";
//            }
//            sessionFactory.getCurrentSession().saveOrUpdate(item);
//        }
//        m.clear();
//        String s = "";
//        if (!params.trim().equals("")) {
//            s = (String) sessionFactory.getCurrentSession().createSQLQuery("select mkvProtocol.CalcWEClassZ(:params, null, 480) from dual")
//                    .setParameter("params", params)
//                    .uniqueResult();
//        }
//        if (s == null){ s="";}
//        if (s.equals("Ok")){ s="";}
//        if (!s.equals("")){
//            return s;
//        }
//
////                .setParameter("params", params, OracleTypes.VARCHAR)
////        .setParameter("params", params)
////                .setParameter("idfactors", null)
////                .setParameter("tm", 480)
////                .setParameter("close", false)
////                .executeUpdate();
//                        //uniqueResult();
////        String s = res;
////                .setParameter("entity_id", entityId.longValue())
////                .setParameter("view_name", viewName)
////                .setParameter("net_fltr_oracle", netFltrOracle)
////                .setParameter("user_name", userName);
////        query.get
////        List viewData = query.list();
////        org.hibernate.Session ses = sessionFactory.getCurrentSession();
////        ses.createStoredProcedureCall()
////        CallableStatement st = sessionFactory.getCurrentSession().connection();
////        ??
//
////        sessionFactory.getCurrentSession().createQuery("update " + SubfactorsValue.class.getName()
////                        + " b set "
////                where b.jobsCode= ?" ). setString(0,token).;
////        sessionFactory.getCurrentSession().createQuery("select b from " + VstructureSubfactorsValueEntity.class.getName() + " b where b.jobsCode= ?" ).setString(0,token).setReadOnly(true).list();
//        return "";
//    }
//

    //----------------------------------------------------
    @Override
    @Transactional
    public String setValuesT1(List<FactorsValue> data, String token) {
        logger.info("------setValue------");
//        HashMap<BigDecimal,BigDecimal> m = new HashMap<BigDecimal,BigDecimal>();
//        String del = "";        logger.info("------setValue------");
        String params = "";
        String err = null;
        for (FactorsValue item: data) {
//            if (!m.containsKey(item.getIdStructure())) {
//                params = params.concat(del).concat(item.getIdStructure().toString());
//                m.put(item.getIdStructure(),null);
//                del = ",";
//            }
            item.setJob(token);


//            String ss = ((item.getId() == null) ? "null"  :  item.getId().toString())+"/"+
//                    ((item.getJob() == null) ? "null"     : item.getJob().toString())+"/"+
//                    ((item.getClassUt() == null)? "null"  : item.getClassUt().toString())+"/"+
//                    ((item.getDurProc() == null)? "null"  :item.getDurProc().toString())+"/"+
//                    ((item.getValue2() == null)? "null"   :item.getValue2().toString())+"/"+
//                    ((item.getIdFactors() == null)? "null": item.getIdFactors().toString())+"/"+
//                    ((item.getClassUtSiz()== null)? "null":item.getClassUtSiz().toString())+"/"+
//                    ((item.getNote()== null)? "null"      : item.getNote().toString())+"/"+
//                    ((item.getIdStatus() == null)? "null" : item.getIdStatus().toString())+"/"+
//                    ((item.getSname() == null) ? "null"   : item.getSname().toString())+"/"+
//                    ((item.getIdStructure() == null)? "null":item.getIdStructure().toString());
//            logger.info("++++"+ss);

            if (item.getIdStatus().intValue() == 20) {
                // удалить
                //sessionFactory.getCurrentSession().delete(item);

                try {
                    BigDecimal ids = item.getId();
                    BigDecimal idStr = item.getIdStructure();
                    BigDecimal idf = item.getIdFactors();

                    BigDecimal count = (BigDecimal)  sessionFactory.getCurrentSession().createSQLQuery("select count(*) from STRUCTURE_FACTORS U where U.ID = :ID and ID_FACTORS = :ID_FACTORS")
                            .setParameter("ID", ids)
                            .setParameter("ID_FACTORS", idf)
                            .uniqueResult();
                    if (count.intValue() > 0){
//                                "{ ? = call name_of_your_function(?) }");
//                        sessionFactory.getCurrentSession().createStoredProcedureCall("CALL STRUCTURE_FACTORS_ADDEDIT(2,:ids,0,:idFact,0,'',0)").p
//                        String s = (String) sessionFactory.getCurrentSession().createSQLQuery("CALL STRUCTURE_FACTORS_ADDEDIT(2,:ids,0,:idFact,0,'',0)")
                        String s = (String) sessionFactory.getCurrentSession().createSQLQuery("select STRUCTURE_FACTORS_ADDEDIT(2,:ids,0,:idFact,0,'',0) from dual")
                                .setParameter("ids", ids)
                                .setParameter("idFact", idf)
                                .uniqueResult();
                        if (s.startsWith("!")){
                            if (err == null) {
                                err = s;
                            }
                        }
                    }

                } catch (Exception e){
                    e.printStackTrace();
                    if (err == null ) {
                        err = e.getMessage();
                    } else {
                        err = err +" "+ e.getMessage();
                    }
                }

            } else {
                BigDecimal idParentStructure = item.getIdStructure();
                BigDecimal count = (BigDecimal)  sessionFactory.getCurrentSession().createSQLQuery("select count(*) from STRUCTURE_WORKPLACE U where U.ID = :ID")
                        .setParameter("ID", idParentStructure)
                        .uniqueResult();
                if (count.intValue() > 0) {
                    sessionFactory.getCurrentSession().saveOrUpdate(item);
                }
            }
        }
//        m.clear();
        if (err == null) {
            params = "Ok";
        } else {
            params = err;
        }
        logger.info("------setValue Ok------");
        return params;
    }

//    @Override
//    @Transactional
//    public String setValuesT2(String params) {
//        logger.info("------Recalc value------");
//        String s = "";
//        if (!params.trim().equals("")) {
//            s = (String) sessionFactory.getCurrentSession().createSQLQuery("select mkvProtocol.CalcWEClassZ(null, null, 480) from dual")
//                    .uniqueResult();
//        }
//        logger.info("------Recalc value ok------");
//        if (s == null){ s="";}
//        if (s.equals("Ok")){ s="";}
//        if (!s.equals("")){
//            logger.info("------Error of Recalc value ("+s+"}------");
//            return s;
//        }
//        return "";
//    }
//----------------------------------------------------

@Override
@Transactional
public void  doRenum(String token){
    logger.info("------Renum workplace ------");
    String s = "";
    if (!token.trim().equals("")) {
        s = (String) sessionFactory.getCurrentSession().createSQLQuery("select ALEX.JobNumContract(:token) from dual")
                .setParameter("token", token)
                .uniqueResult();
    }
    logger.info("------Renum workplace ok------");
    if (s.startsWith("!")){
        logger.info("------Error of Renum workplace ("+s+")------");
    }
    if (s.equals("-1")){
        logger.info("------Error of Renum workplace not found ("+token+"}------");
    }

}


@Override
@Transactional
public String doRecalc(String token) {
    logger.info("------Recalc value------");
    String s = "";
    if (!token.trim().equals("")) {
        s = (String) sessionFactory.getCurrentSession().createSQLQuery("select mkvProtocol.CalcWEClassZ(null, null, 480,:token) from dual")
//        s = (String) sessionFactory.getCurrentSession().createSQLQuery("select CALC_ALLWP_JOBS(:token) from dual")
                .setParameter("token", token)
                .uniqueResult();
    }
    logger.info("------Recalc value ok------");

    //--------это для CALC_ALLWP_JOBS --------------
//    if (s.startsWith("!")) {
//            return  s;
//    }
//    return "";


    //------------- это для mkvProtocol.CalcWEClassZ --------------
    if (s == null){ s="";}
    if (s.equals("Ok")){ s="";}
    if (!s.equals("")){
        logger.info("------Error of Recalc value ("+s+"}------");
        return s;
    }
    return "";
}
    //----------------------------------------------------
    @Override
    @Transactional
    public List<Errors> doFuzzyRecalc(String token) {
        logger.info("------Recalc value------");
        String s = "";
        if (!token.trim().equals("")) {
            try {
                s = (String) sessionFactory.getCurrentSession().createSQLQuery("select mkvProtocol.CalcWEClassFuzzyLogic(:token, null) from dual")
                        .setParameter("token", token)
                        .uniqueResult();
            } catch (Exception e){
                e.printStackTrace();

            }
        }
        logger.info("------Recalc value ok------");
        if (s == null){ s="";}
        if (s.equals("Ok")){ s="";}
        ArrayList<Errors> errorsArrayList = new ArrayList<Errors>();
        if (!s.equals("")){
            logger.info("------Error of Recalc value ("+s+"}------");
            return errorsArrayList;
        }
        return errorsArrayList;
    }
    //----------------------------------------------------
//
//    @Override
//    @Transactional
//    public String setRecalcs(List<FactorsValue> data) {
//        logger.info("------setValue------");
//        HashMap<BigDecimal,BigDecimal> m = new HashMap<BigDecimal,BigDecimal>();
//        String del = "";
//        String params = "";
//        for (FactorsValue item: data) {
//            if (!m.containsKey(item.getIdStructure())) {
//                params = params.concat(del).concat(item.getIdStructure().toString());
//                m.put(item.getIdStructure(),null);
//                del = ",";
//            }
////            sessionFactory.getCurrentSession().saveOrUpdate(item);
//        }
//        m.clear();
//        String s  = (String) sessionFactory.getCurrentSession().createSQLQuery("select mkvProtocol.CalcWEClass(:params, null, 480, 0) from dual")
//                .setParameter("params", params)
//                .uniqueResult();
//        if (!s.equals("")){
//            return s;
//        }
//        return "";
//    }

    @Override
    @Transactional
    public String setWorkplace(List<WorkPlace> data,String token) {
        logger.info("------setWorkplacee------");
//        List<WT> list = sessionFactory.getCurrentSession().createSQLQuery("select STRUCTURE_FACTORS_SEQ.Nextval from dual;").setReadOnly(true).list();
        String err = null;
        for (WorkPlace item: data) {
            if (item.getIdStatus().intValue() == 22){
                // удалить
//                sessionFactory.getCurrentSession().delete(item);
                BigDecimal idStructure   = item.getId();
                BigDecimal idPar         = item.getIdPar();
                BigDecimal idContract    = item.getIdContract();
                BigDecimal typeRec     = item.getTyperec();
                logger.info("------delete Workplace "+idStructure+"------");

                BigDecimal count = (BigDecimal)  sessionFactory.getCurrentSession().createSQLQuery("select count(*) from STRUCTURE_WORKPLACE U where U.ID = :ID")
                        .setParameter("ID", idStructure)
                        .uniqueResult();
                if (count.intValue() > 0) {
                    //try {
                    String s = (String) sessionFactory.getCurrentSession().createSQLQuery("select STRUCTURE_ADDEDITNODE(2,:ID_STRUCTURE, :ID_PAR, :ID_CONTRACT, 0, 0, 0, 0, 0, 0, 1, :TYPEREC, '', '', '', '', '', '') from dual")
                            .setParameter("ID_STRUCTURE", idStructure)
                            .setParameter("ID_PAR", idPar)
                            .setParameter("ID_CONTRACT", idContract)
                            .setParameter("TYPEREC", typeRec)
                            .uniqueResult();
                    logger.info("------delete return "+s+"------");
                    if (s.startsWith("!")) {
                        if (err == null) {
                            err = s;
                        }
                    }
                    //} catch (Exception e) {
                    //    e.printStackTrace();
                    //    throw  e;
                    //}
                }

            } else {
//                if (item.getOutArea().intValue() == -1) {
//                    item.setExtCode(token);
//                    logger.info("------Insert Workplacee------");
//
//                    BigDecimal count = (BigDecimal)  sessionFactory.getCurrentSession().createSQLQuery("select count(*) from STRUCTURE_WORKPLACE U where U.ID = :ID")
//                            .setParameter("ID", item.getId())
//                            .uniqueResult();
//                    if (count.intValue() == 0) {
//                        String s = (String) sessionFactory.getCurrentSession().createSQLQuery("select STRUCTURE_ADDEDITNODE(0,:ID_STRUCTURE, :ID_PAR, :ID_CONTRACT, :NAME_OBJECT, null, NULL , NULL , NULL, :TYPEWP, :ID_STATUS, :TYPEREC, :EXTCODE, :NOTE, :OUTAREA, NULL, NULL, NULL) from dual")
//                                .setParameter("ID_STRUCTURE", item.getId())
//                                .setParameter("ID_PAR", item.getIdPar())
//                                .setParameter("ID_CONTRACT", item.getIdContract())
//                                .setParameter("NAME_OBJECT", item.getNameObject())
//
//                                .setParameter("TYPEWP", item.getTypeWp())
//                                .setParameter("ID_STATUS", item.getIdStatus())
//                                .setParameter("EXTCODE", item.getExtCode())
//                                .setParameter("TYPEREC", item.getTyperec())
//                                .setParameter("NOTE", item.getNote())
//                                .setParameter("OUTAREA", item.getOutArea())
//
//                                .uniqueResult();
//                        if (s.startsWith("!")) {
//                            if (err == null) {
//                                err = s;
//                            }
//                        }
//                    }
//
//                } else {
                    item.setExtCode(token);
                    sessionFactory.getCurrentSession().saveOrUpdate(item);
//                }
            }
        }
        return err;
    }

    @Override
    @Transactional
    public List<VtableFactor> getActsOnFactor(String token, String idWorkPlace, String idFactors){
        logger.info("-----getacts -----");
//        List<VtableFactor> ret = sessionFactory.getCurrentSession().createQuery("select b from " + VtableFactor.class.getName() + " b where b.jobsCode= ? and b.idWp= ? and b.idFactor= ?").setString(0, token).setString(1,idWorkPlace).setString(2,idWorkPlace).setReadOnly(true).list();
        List<VtableFactor> ret = sessionFactory.getCurrentSession().createQuery("select b from " + VtableFactor.class.getName() + " b where b.idWp= :idWp and b.idFactors= :idFactors").setString("idWp", idWorkPlace).setString("idFactors",idFactors).setReadOnly(true).list();
//        if (ret.size()>0){
//            logger.info("-----markValues -----");
//            sessionFactory.getCurrentSession().createQuery("update Jobs b set b.idStatus = 16 where b.jobsCode = ? and b.idStatus = 15").setParameter(0, token).executeUpdate();
//        }
        logger.info("-----Ok -----");
        return ret; //sessionFactory.getCurrentSession().createQuery("select b from " + VstructureSubfactorsValueEntity.class.getName() + " b where b.jobsCode= ?").setString(0, token).setReadOnly(true).list();

    }

    @Override
    @Transactional
    public List<KartWorkplace> getKartOnWorkplace(String token, String idWorkPlace) {
        logger.info("-----getacts -----");
        List<KartWorkplace> ret = sessionFactory.getCurrentSession().createQuery("select b from " + KartWorkplace.class.getName() + " b where b.id= :idWp").setString("idWp", idWorkPlace).setReadOnly(true).list();
        logger.info("-----Ok -----");
        return ret; //sessionFactory.getCurrentSession().createQuery("select b from " + VstructureSubfactorsValueEntity.class.getName() + " b where b.jobsCode= ?").setString(0, token).setReadOnly(true).list();
    }

    @Override
    @Transactional
    public List<GetStructure2050> getKart2050(String token) {
        logger.info("-----katrs2050 -----");
        //ID_STRUCTURE,TOTAL_WP,WOMEN_WP,PRIOR18_WP,DISABLED_WP
        List<GetStructure2050> ret = sessionFactory.getCurrentSession().createSQLQuery("select * from table(gsg.GSG_GETKARTS2050('" + token + "'))")
                .addEntity(GetStructure2050.class)
                .list();
        logger.info("-----Ok -----");
        return ret;
    }

    @Override
    @Transactional
    public boolean setKarts2050(List<GetStructure2050> data) {
        logger.info("------setkarts2050------");
//        Structure2050 item1  = new Structure2050();
//        WpSourceFactor item2 = new WpSourceFactor();
        for (GetStructure2050 item: data) {
            Structure2050 item1  = new Structure2050();
            WpSourceFactor item2 = new WpSourceFactor();
            item1.setIdStructure(item.getIdStructure());
            item1.setTotalWp(item.getTotalWp());
            item1.setWomenWp(item.getWomenWp());
            item1.setPrior18Wp(item.getPrior18Wp());
            item1.setDisabledWp(item.getDisabledWp());
            item1.setMashineWp(item.getMashineWp());
            item1.setMaterialWp(item.getMaterialWp());
            item1.setCommWork(item.getCommWork());
            sessionFactory.getCurrentSession().saveOrUpdate(item1);

            item2.setIdWp(item.getIdStructure());
            item2.setSf1(item.getSf1());
            item2.setSf3(item.getSf3());
            item2.setSf4(item.getSf4());
            item2.setSf5(item.getSf5());
            item2.setSf6(item.getSf6());
            item2.setSf7(item.getSf7());
            item2.setSf8(item.getSf8());
            item2.setSf13(item.getSf13());
            item2.setSf14(item.getSf13()); // дубликат
            item2.setSf15(item.getSf15());
            sessionFactory.getCurrentSession().saveOrUpdate(item2);

        }
        return true;

    }

    @Override
    @Transactional
    public List<LispJobs> getLispJobs(String login, String password){
        logger.info("-----LispJobs -----");
//        return sessionFactory.getCurrentSession().createQuery("select b from " + LispJobs.class.getName() + " b ").setReadOnly(true).list();
        return sessionFactory.getCurrentSession().createQuery("select b from " + LispJobs.class.getName() + " b where b.lstr= :login and b.pstr= :password").setString("login", login).setString("password",password).setReadOnly(true).list();
    }


    @Override
    @Transactional
    public List<Ion> getIon() {
        logger.info("-----ION -----");
        return sessionFactory.getCurrentSession().createQuery("select b from " + Ion.class.getName() + " b").setReadOnly(true).list();
    }

    @Override
    @Transactional
    public String getTestUser(String login, String password) {
        logger.info("-----test User -----");
        // возврат TT есть и логин и пароль, TF - логин есть пароля нет, FF - нет ни логина ни пароля
//        sessionFactory.getCurrentSession().createQuery("select b from " + LispJobs.class.getName() + " b where b.lstr= :login and b.pstr= :password").setString("login", login).setString("password",password).setReadOnly(true).list();
        BigDecimal count = (BigDecimal)  sessionFactory.getCurrentSession().createSQLQuery("select count(*) from SPR_USERS U where U.LSTR = :LSTR and U.PSTR = :PSTR")
                .setParameter("LSTR", login)
                .setParameter("PSTR", password)
                .uniqueResult();
        if (count.intValue() > 0){
            return "TT";
        } else{
            BigDecimal count1 = (BigDecimal)  sessionFactory.getCurrentSession().createSQLQuery("select count(*) from SPR_USERS U where U.LSTR = :LSTR")
                    .setParameter("LSTR", login)
                    .uniqueResult();
            if (count1.intValue() > 0) {
                return "TF";
            } else {
                return "FF";
            }
        }
    }

}
