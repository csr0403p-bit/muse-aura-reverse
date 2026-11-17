package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface ConnectionsSheetItem {

    public final class Group implements ConnectionsSheetItem {
        public static final int $stable = ConnectionsGroup.$stable;
        public final ConnectionsGroup group;

        public Group(ConnectionsGroup connectionsGroup) {
            C7384Etj.A0Y(connectionsGroup, 0);
            this.group = connectionsGroup;
        }

        public final ConnectionsGroup getGroup() {
            return this.group;
        }
    }

    public final class Person implements ConnectionsSheetItem {
        public static final int $stable = 8;
        public final ConnectionsPerson person;

        public Person(ConnectionsPerson connectionsPerson) {
            C7384Etj.A0Y(connectionsPerson, 0);
            this.person = connectionsPerson;
        }

        public final ConnectionsPerson getPerson() {
            return this.person;
        }
    }
}
