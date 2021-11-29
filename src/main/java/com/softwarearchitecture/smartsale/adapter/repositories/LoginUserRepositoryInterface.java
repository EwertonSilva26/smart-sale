package com.softwarearchitecture.smartsale.adapter.repositories;

import com.softwarearchitecture.smartsale.entities.User;

public interface LoginUserRepositoryInterface {

    User LoginUser(User user) throws Exception;

}
