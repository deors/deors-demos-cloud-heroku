package deors.demos.cloud.heroku.repositories;

import java.util.Collection;

import deors.demos.cloud.heroku.entities.Codes;

public interface CodesDAO {

    Collection<? extends Codes> selectAll();

    Codes select(Codes criteria);

    Codes insert(Codes record);

    int update(Codes record);

    int delete(Codes record);
}
