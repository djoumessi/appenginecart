package com.appenginecart.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-10-01 10:30:06")
/** */
public final class ProductMeta extends org.slim3.datastore.ModelMeta<com.appenginecart.model.Product> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.appenginecart.model.Product, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<com.appenginecart.model.Product, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.appenginecart.model.Product, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<com.appenginecart.model.Product, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final ProductMeta slim3_singleton = new ProductMeta();

    /**
     * @return the singleton
     */
    public static ProductMeta get() {
       return slim3_singleton;
    }

    /** */
    public ProductMeta() {
        super("Product", com.appenginecart.model.Product.class);
    }

    @Override
    public com.appenginecart.model.Product entityToModel(com.google.appengine.api.datastore.Entity entity) {
        com.appenginecart.model.Product model = new com.appenginecart.model.Product();
        model.setKey(entity.getKey());
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        com.appenginecart.model.Product m = (com.appenginecart.model.Product) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        com.appenginecart.model.Product m = (com.appenginecart.model.Product) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        com.appenginecart.model.Product m = (com.appenginecart.model.Product) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        com.appenginecart.model.Product m = (com.appenginecart.model.Product) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        com.appenginecart.model.Product m = (com.appenginecart.model.Product) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        com.appenginecart.model.Product m = (com.appenginecart.model.Product) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected com.appenginecart.model.Product jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        com.appenginecart.model.Product m = new com.appenginecart.model.Product();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}