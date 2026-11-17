package com.google.common.collect;

import X.AnonymousClass001;
import X.BV4;
import X.BV6;
import X.BV7;
import X.C3cG;
import X.C60O;
import X.C8j3;
import com.facebook.aura.commands.photos.DeviceMediaStoreReaderKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.Serializable;
import java.lang.Comparable;

/* loaded from: classes5.dex */
public abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {
    public static final long serialVersionUID = 0;
    public final C endpoint;

    public final class AboveAll extends Cut<Comparable<?>> {
        public static final AboveAll A00 = new AboveAll();
        public static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut
        public final int A00(Cut<Comparable<?>> o) {
            return o == this ? 0 : 1;
        }

        public AboveAll() {
            super("");
        }

        private Object readResolve() {
            return A00;
        }

        public final String toString() {
            return "+\u221e";
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return System.identityHashCode(this);
        }
    }

    public final class AboveValue<C extends Comparable> extends Cut<C> {
        public static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object that) {
            return super.A00((Cut) that);
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return this.endpoint.hashCode() ^ (-1);
        }

        public final String toString() {
            StringBuilder sbA0x = C60O.A0x(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
            sbA0x.append(this.endpoint);
            return AnonymousClass001.A0v(DeviceMediaStoreReaderKt.LIKE_ESCAPE_CHAR, sbA0x);
        }
    }

    public final class BelowAll extends Cut<Comparable<?>> {
        public static final BelowAll A00 = new BelowAll();
        public static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut
        public final int A00(Cut<Comparable<?>> o) {
            return o == this ? 0 : -1;
        }

        public BelowAll() {
            super("");
        }

        private Object readResolve() {
            return A00;
        }

        public final String toString() {
            return "-\u221e";
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return System.identityHashCode(this);
        }
    }

    public final class BelowValue<C extends Comparable> extends Cut<C> {
        public static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object that) {
            return super.A00((Cut) that);
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return this.endpoint.hashCode();
        }

        public final String toString() {
            StringBuilder sbA0x = C60O.A0x(DeviceMediaStoreReaderKt.LIKE_ESCAPE_CHAR);
            sbA0x.append(this.endpoint);
            return AnonymousClass001.A0v(CustomConnectorRegisterRepositoryKt.ROOT_PATH, sbA0x);
        }
    }

    public abstract int hashCode();

    public int A00(Cut<C> that) {
        if (that == BelowAll.A00) {
            return 1;
        }
        if (that == AboveAll.A00) {
            return -1;
        }
        C c = this.endpoint;
        C c2 = that.endpoint;
        Range<Comparable> range = Range.A00;
        int iCompareTo = c.compareTo(c2);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        boolean z = this instanceof AboveValue;
        if (z == (that instanceof AboveValue)) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public final BoundType A01() {
        if (this instanceof BelowValue) {
            return BoundType.CLOSED;
        }
        if (this instanceof BelowAll) {
            throw BV4.A0T();
        }
        if (this instanceof AboveValue) {
            return BoundType.OPEN;
        }
        throw BV4.A0N("this statement should be unreachable");
    }

    public final BoundType A02() {
        if (this instanceof BelowValue) {
            return BoundType.OPEN;
        }
        if (this instanceof BelowAll) {
            throw BV4.A0N("this statement should be unreachable");
        }
        if (this instanceof AboveValue) {
            return BoundType.CLOSED;
        }
        throw BV4.A0T();
    }

    public final C A03() {
        if (this instanceof BelowAll) {
            throw C3cG.A0Q("range unbounded on this side");
        }
        if (this instanceof AboveAll) {
            throw C3cG.A0Q("range unbounded on this side");
        }
        return this.endpoint;
    }

    public final void A04(StringBuilder sb) {
        char c;
        if (this instanceof BelowValue) {
            c = '[';
        } else if (this instanceof BelowAll) {
            sb.append("(-\u221e");
            return;
        } else {
            if (!(this instanceof AboveValue)) {
                throw BV6.A0f();
            }
            c = '(';
        }
        sb.append(c);
        sb.append(this.endpoint);
    }

    public final void A05(StringBuilder sb) {
        char c;
        if (this instanceof BelowValue) {
            sb.append(this.endpoint);
            c = ')';
        } else {
            if (this instanceof BelowAll) {
                throw BV6.A0f();
            }
            if (!(this instanceof AboveValue)) {
                sb.append("+\u221e)");
                return;
            } else {
                sb.append(this.endpoint);
                c = ']';
            }
        }
        sb.append(c);
    }

    public final boolean A06(C value) {
        if (this instanceof BelowValue) {
            C c = this.endpoint;
            Range<Comparable> range = Range.A00;
            return BV7.A1R(c.compareTo(value));
        }
        if (this instanceof BelowAll) {
            return true;
        }
        if (!(this instanceof AboveValue)) {
            return false;
        }
        C c2 = this.endpoint;
        Range<Comparable> range2 = Range.A00;
        return C8j3.A1R(c2.compareTo(value));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object that) {
        int i = this instanceof BelowAll ? -1 : 1;
        if (that == this) {
            return 0;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Cut) {
            try {
                if (A00((Cut) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public Cut(C endpoint) {
        this.endpoint = endpoint;
    }
}
