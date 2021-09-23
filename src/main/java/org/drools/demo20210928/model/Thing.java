package org.drools.demo20210928.model;

public class Thing implements java.io.Serializable {
	static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Key
	@org.kie.api.definition.type.Position(0)
    private final String name;

    @org.kie.api.definition.type.Key
	@org.kie.api.definition.type.Position(1)
    private final int volume;

    public Thing(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return volume == thing.volume && name.equals(thing.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, volume);
    }
}