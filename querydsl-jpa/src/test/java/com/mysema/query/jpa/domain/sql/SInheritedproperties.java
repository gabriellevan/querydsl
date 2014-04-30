package com.mysema.query.jpa.domain.sql;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;

import com.mysema.query.sql.ColumnMetadata;


/**
 * SInheritedproperties is a Querydsl query type for SInheritedproperties
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class SInheritedproperties extends com.mysema.query.sql.RelationalPathBase<SInheritedproperties> {

    private static final long serialVersionUID = -992601885;

    public static final SInheritedproperties inheritedproperties_ = new SInheritedproperties("inheritedproperties_");

    public final StringPath classProperty = createString("classProperty");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath stringAsSimple = createString("stringAsSimple");

    public final StringPath superclassProperty = createString("superclassProperty");

    public final com.mysema.query.sql.PrimaryKey<SInheritedproperties> primary = createPrimaryKey(id);

    public SInheritedproperties(String variable) {
        super(SInheritedproperties.class, forVariable(variable), "null", "inheritedproperties_");
        addMetadata();
    }

    public SInheritedproperties(String variable, String schema, String table) {
        super(SInheritedproperties.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SInheritedproperties(Path<? extends SInheritedproperties> path) {
        super(path.getType(), path.getMetadata(), "null", "inheritedproperties_");
        addMetadata();
    }

    public SInheritedproperties(PathMetadata<?> metadata) {
        super(SInheritedproperties.class, metadata, "null", "inheritedproperties_");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(classProperty, ColumnMetadata.named("classProperty").withIndex(4).ofType(12).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(-5).withSize(19).notNull());
        addMetadata(stringAsSimple, ColumnMetadata.named("stringAsSimple").withIndex(2).ofType(12).withSize(255));
        addMetadata(superclassProperty, ColumnMetadata.named("superclassProperty").withIndex(3).ofType(12).withSize(255));
    }

}

