package com.facebook.aura.browsertask.view;

import X.C7384Etj;
import X.FGI;

/* loaded from: classes2.dex */
public interface AgentComputerText {

    public final class Literal implements AgentComputerText {
        public static final int $stable = 0;
        public final String value;

        public Literal(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        public final Literal copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Literal(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Literal) && C7384Etj.areEqual(this.value, ((Literal) obj).value));
        }

        public static /* synthetic */ Literal copy$default(Literal literal, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = literal.value;
            }
            C7384Etj.A0Y(str, 0);
            return new Literal(str);
        }

        public final String component1() {
            return this.value;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return FGI.A0U("Literal(value=", this.value, ")");
        }
    }

    public final class Resource implements AgentComputerText {
        public static final int $stable = 0;
        public final int id;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Resource) && this.id == ((Resource) obj).id);
        }

        public static /* synthetic */ Resource copy$default(Resource resource, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = resource.id;
            }
            return new Resource(i);
        }

        public final int component1() {
            return this.id;
        }

        public final Resource copy(int i) {
            return new Resource(i);
        }

        public final int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id;
        }

        public String toString() {
            return FGI.A0I("Resource(id=", this.id, ")");
        }

        public Resource(int i) {
            this.id = i;
        }
    }
}
