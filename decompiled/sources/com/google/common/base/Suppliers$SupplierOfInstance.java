package com.google.common.base;

import X.BV7;
import X.C60O;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class Suppliers$SupplierOfInstance<T> implements Supplier<T>, Serializable {
    public static final long serialVersionUID = 0;
    public final T instance;

    public boolean equals(Object obj) {
        if (obj instanceof Suppliers$SupplierOfInstance) {
            return Objects.equal(this.instance, ((Suppliers$SupplierOfInstance) obj).instance);
        }
        return false;
    }

    @Override // com.google.common.base.Supplier
    public T get() {
        return this.instance;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.instance});
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("Suppliers.ofInstance(");
        sbA0x.append(this.instance);
        return BV7.A10(sbA0x);
    }

    public Suppliers$SupplierOfInstance(T instance) {
        this.instance = instance;
    }
}
