package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hq;
import X.C9hr;
import X.C9iI;
import X.C9uG;
import X.F60;
import java.lang.annotation.Annotation;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public interface ConnectionsSheetSubject {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final C9hr<ConnectionsSheetSubject> serializer() {
            return new C9hq("com.facebook.aura.navigation.key.ConnectionsSheetSubject", C3cG.A0x(ConnectionsSheetSubject.class), new Annotation[0], new C9uG[]{C3cG.A0x(Group.class), C3cG.A0x(Person.class)}, new C9hr[]{ConnectionsSheetSubject$Group$$serializer.INSTANCE, ConnectionsSheetSubject$Person$$serializer.INSTANCE});
        }
    }

    @Serializable
    public final class Group extends C06G implements ConnectionsSheetSubject {
        public static final Companion Companion = new Companion();
        public final String connectionId;

        public final class Companion {
            public final C9hr<Group> serializer() {
                return ConnectionsSheetSubject$Group$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public final Group copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Group(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Group) && C7384Etj.areEqual(this.connectionId, ((Group) obj).connectionId));
        }

        public /* synthetic */ Group(int i, String str, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(ConnectionsSheetSubject$Group$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.connectionId = str;
        }

        public static /* synthetic */ Group copy$default(Group group, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = group.connectionId;
            }
            C7384Etj.A0Y(str, 0);
            return new Group(str);
        }

        public final String component1() {
            return this.connectionId;
        }

        public final String getConnectionId() {
            return this.connectionId;
        }

        public int hashCode() {
            return this.connectionId.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public Group(String str) {
            C7384Etj.A0Y(str, 0);
            this.connectionId = str;
        }
    }

    @Serializable
    public final class Person extends C06G implements ConnectionsSheetSubject {
        public static final Companion Companion = new Companion();
        public final String museId;

        public final class Companion {
            public final C9hr<Person> serializer() {
                return ConnectionsSheetSubject$Person$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public final Person copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Person(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Person) && C7384Etj.areEqual(this.museId, ((Person) obj).museId));
        }

        public /* synthetic */ Person(int i, String str, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(ConnectionsSheetSubject$Person$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.museId = str;
        }

        public static /* synthetic */ Person copy$default(Person person, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = person.museId;
            }
            C7384Etj.A0Y(str, 0);
            return new Person(str);
        }

        public final String component1() {
            return this.museId;
        }

        public final String getMuseId() {
            return this.museId;
        }

        public int hashCode() {
            return this.museId.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public Person(String str) {
            C7384Etj.A0Y(str, 0);
            this.museId = str;
        }
    }
}
