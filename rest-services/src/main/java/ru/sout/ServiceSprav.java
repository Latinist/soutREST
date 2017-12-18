package ru.sout;

import org.hibernate.SessionFactory;
import ru.sout.pojo.*;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Анатолий on 06.02.2015.
 */
public interface ServiceSprav {
    public void setSessionFactory(SessionFactory sessionFactory);
    public List<SprFactors> getFactors();
    public List<SprSubFactors> getSubFactors();
    public List<SprTemplates> getSprTemplates();
    public List getWorkPlace(String token);
    public List<FactorsValue> getValues(String token);

//    public String setValues(List<FactorsValue> data);
    public String setValuesT1(List<FactorsValue> data, String token);
//    public String setValuesT2(String params);

    public String setWorkplace(List<WorkPlace> datav,String token);
    public List<VtableFactor> getActsOnFactor(String token, String idZone, String idFactor);
    List<KartWorkplace> getKartOnWorkplace(String token, String idWP);
    List<GetStructure2050> getKart2050(String token);
    boolean setKarts2050(List<GetStructure2050> data);
    List<LispJobs> getLispJobs(String login, String password);
    List<Ion> getIon();
    String getTestUser(String login, String password);

    @Transactional
    void  doRenum(String token);

    String doRecalc(String token);
    List<Errors> doFuzzyRecalc(String token);
}
