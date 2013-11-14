package deors.demos.cloud.heroku.services;

import java.util.Collection;

import deors.demos.cloud.heroku.entities.Codes;
import deors.demos.cloud.heroku.repositories.CodesDAO;

public interface CodesService {

    void setCodesDAO(CodesDAO codesDAO);

    Collection<? extends Codes> selectAll();

    Codes select(Codes criteria);

    Codes insert(Codes record);

    int update(Codes record);

    int delete(Codes record);
}
