package org.drools.demo20210928.model;

public class Containment implements java.io.Serializable {
	static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Key
	@org.kie.api.definition.type.Position(0)
    private final Thing container;
    
    @org.kie.api.definition.type.Key
	@org.kie.api.definition.type.Position(1)
    private final Thing contained;

    public Containment(Thing container, Thing contained) {
        this.container = container;
        this.contained = contained;
    }

    public Thing getContainer() {
        return container;
    }

    public Thing getContained() {
        return contained;
    }

    @Override
    public String toString() {
        return "Containment{" +
                "container=" + container +
                ", contained=" + contained +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Containment that = (Containment) o;
        return container.equals(that.container) && contained.equals(that.contained);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(container, contained);
    }
}