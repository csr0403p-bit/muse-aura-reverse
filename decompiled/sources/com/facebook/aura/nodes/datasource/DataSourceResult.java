package com.facebook.aura.nodes.datasource;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface DataSourceResult {

    public final class AlreadyReplied implements DataSourceResult {
        public static final AlreadyReplied INSTANCE = new AlreadyReplied();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AlreadyReplied);
        }

        public String toString() {
            return "AlreadyReplied";
        }

        public int hashCode() {
            return 1814496209;
        }
    }

    public final class Error extends C06G implements DataSourceResult {
        public final String code;
        public final String message;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Error) {
                    Error error = (Error) obj;
                    if (!C7384Etj.areEqual(this.code, error.code) || !C7384Etj.areEqual(this.message, error.message)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.code;
            }
            if ((i & 2) != 0) {
                str2 = error.message;
            }
            AnonymousClass003.A0u(str, str2);
            return new Error(str, str2);
        }

        public final String component1() {
            return this.code;
        }

        public final String component2() {
            return this.message;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.message, AnonymousClass001.A0G(this.code));
        }

        public Error(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.code = str;
            this.message = str2;
        }

        public final Error copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Error(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Ok implements DataSourceResult {
        public static final Ok INSTANCE = new Ok();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ok);
        }

        public String toString() {
            return "Ok";
        }

        public int hashCode() {
            return -441654228;
        }
    }

    public final class Synced extends C06G implements DataSourceResult {
        public final int added;
        public final int itemCount;
        public final int removed;
        public final int updated;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Synced) {
                    Synced synced = (Synced) obj;
                    if (this.itemCount != synced.itemCount || this.added != synced.added || this.updated != synced.updated || this.removed != synced.removed) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Synced copy$default(Synced synced, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = synced.itemCount;
            }
            if ((i5 & 2) != 0) {
                i2 = synced.added;
            }
            if ((i5 & 4) != 0) {
                i3 = synced.updated;
            }
            if ((i5 & 8) != 0) {
                i4 = synced.removed;
            }
            return new Synced(i, i2, i3, i4);
        }

        public final int component1() {
            return this.itemCount;
        }

        public final int component2() {
            return this.added;
        }

        public final int component3() {
            return this.updated;
        }

        public final int component4() {
            return this.removed;
        }

        public final Synced copy(int i, int i2, int i3, int i4) {
            return new Synced(i, i2, i3, i4);
        }

        public final int getAdded() {
            return this.added;
        }

        public final int getItemCount() {
            return this.itemCount;
        }

        public final int getRemoved() {
            return this.removed;
        }

        public final int getUpdated() {
            return this.updated;
        }

        public int hashCode() {
            return (((((this.itemCount * 31) + this.added) * 31) + this.updated) * 31) + this.removed;
        }

        public /* synthetic */ Synced(int i, int i2, int i3, int i4, int i5, C06H c06h) {
            this(i, C3cG.A01(i5, i2), (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
        }

        public String toString() {
            return super.toString();
        }

        public Synced(int i, int i2, int i3, int i4) {
            this.itemCount = i;
            this.added = i2;
            this.updated = i3;
            this.removed = i4;
        }
    }
}
