package com.google.common.base;

import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class Equivalence<T> {

    public final class Equals extends Equivalence<Object> implements Serializable {
        public static final Equals INSTANCE = new Equals();
        public static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(Object a, Object b) {
            return a.equals(b);
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(Object o) {
            return o.hashCode();
        }
    }

    public final class Identity extends Equivalence<Object> implements Serializable {
        public static final Identity INSTANCE = new Identity();
        public static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(Object o) {
            return System.identityHashCode(o);
        }

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(Object a, Object b) {
            return false;
        }
    }

    public abstract boolean doEquivalent(T a, T b);

    public abstract int doHash(T t);

    public final boolean equivalent(T a, T b) {
        if (a == b) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return doEquivalent(a, b);
    }
}
