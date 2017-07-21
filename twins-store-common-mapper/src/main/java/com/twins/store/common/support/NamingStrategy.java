package com.twins.store.common.support;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyComponentPathImpl;
import org.hibernate.boot.spi.MetadataBuildingContext;

/**
 * Created by takesi on 2017/07/19.
 */
public class NamingStrategy extends ImplicitNamingStrategyComponentPathImpl {

    @Override
    protected Identifier toIdentifier(String stringForm, MetadataBuildingContext buildingContext) {
        return super.toIdentifier("" + stringForm, buildingContext);
    }

}
