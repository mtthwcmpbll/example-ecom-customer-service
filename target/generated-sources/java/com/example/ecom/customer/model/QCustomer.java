package com.example.ecom.customer.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCustomer is a Querydsl query type for Customer
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCustomer extends EntityPathBase<Customer> {

    private static final long serialVersionUID = -1991174510;

    public static final QCustomer customer = new QCustomer("customer");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QCustomer(String variable) {
        super(Customer.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QCustomer(Path<? extends Customer> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    public QCustomer(PathMetadata<?> metadata) {
        super(Customer.class, metadata);
    }

}

