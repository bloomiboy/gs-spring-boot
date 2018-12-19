package modules;

public class FeedModule implements IBaseModule {

    protected String id;
    protected String props;
    protected ModuleEnum moduleType;

    @Override
    public String getName() {
        return "feed";
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getProperties() {
        return props;
    }

    @Override
    public String getModuleType() {
        if (moduleType != null)
            return moduleType.name();
        else
            return null;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    public void setProperties(String props) {
        this.props = props;
    }

    public void setModuleType(ModuleEnum moduleType) {
        this.moduleType = moduleType;
    }

}