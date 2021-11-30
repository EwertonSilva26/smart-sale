package com.softwarearchitecture.smartsale.useCase;

import com.softwarearchitecture.smartsale.entities.Person;
import com.softwarearchitecture.smartsale.entities.User;

public interface LoginUserUseCaseInterface {

    User loginUser(User user) throws Exception;

}
