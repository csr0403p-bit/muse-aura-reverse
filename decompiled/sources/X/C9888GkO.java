package X;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.lang.annotation.Annotation;

/* renamed from: X.GkO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9888GkO extends AbstractC9910Gks implements Serializable {
    public static final long serialVersionUID = 1;
    public transient GQ5<String, Boolean> A00 = new GQ5<>(48, 48);
    public boolean _cfgConstructorPropertiesImpliesCreator = true;
    public static final Class<? extends Annotation>[] A02 = {JsonSerialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonRawValue.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class};
    public static final Class<? extends Annotation>[] A01 = {JsonDeserialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class, JsonMerge.class};

    static {
        try {
            Hko hko = Hko.$redex_init_class;
        } catch (Throwable th) {
            HwR.A00(th);
        }
    }

    public static boolean A01(AbstractC9870GjI abstractC9870GjI, Class<?> cls) {
        if (abstractC9870GjI._class.isPrimitive()) {
            return AnonymousClass002.A1Z(abstractC9870GjI._class, AbstractC9855Gj3.A01(cls));
        }
        return cls.isPrimitive() && cls == AbstractC9855Gj3.A01(abstractC9870GjI._class);
    }

    public Object readResolve() {
        if (this.A00 == null) {
            this.A00 = new GQ5<>(48, 48);
        }
        return this;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/Go7;LX/GjI;)LX/GoN<*>; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.GoN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC10043GoN A00(X.AbstractC9901Gkh r9, X.AbstractC10031Go7 r10, X.C9888GkO r11) {
        /*
            X.GnQ r5 = r11.A0E(r10)
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonTypeResolver> r0 = com.fasterxml.jackson.databind.annotation.JsonTypeResolver.class
            java.lang.annotation.Annotation r0 = r10.A0A(r0)
            com.fasterxml.jackson.databind.annotation.JsonTypeResolver r0 = (com.fasterxml.jackson.databind.annotation.JsonTypeResolver) r0
            r3 = 0
            if (r0 == 0) goto L74
            if (r5 == 0) goto L9b
            java.lang.Class r0 = r0.value()
            java.lang.Object r0 = X.AbstractC7608F5v.A0h(r9, r0)
            X.GoN r0 = (X.InterfaceC10043GoN) r0
        L1b:
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver> r1 = com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver.class
            java.lang.annotation.Annotation r1 = r10.A0A(r1)
            com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver r1 = (com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver) r1
            if (r1 == 0) goto L2f
            java.lang.Class r1 = r1.value()
            java.lang.Object r3 = X.AbstractC7608F5v.A0h(r9, r1)
            X.Gix r3 = (X.InterfaceC9853Gix) r3
        L2f:
            X.Gow r2 = r5._inclusionType
            X.Gow r1 = X.EnumC10075Gow.EXTERNAL_PROPERTY
            if (r2 != r1) goto L4a
            boolean r1 = r10 instanceof X.C9909Gkr
            if (r1 == 0) goto L4a
            X.Gow r6 = X.EnumC10075Gow.PROPERTY
            X.Gon r7 = r5._idType
            java.lang.String r10 = r5._propertyName
            java.lang.Class<?> r9 = r5._defaultImpl
            boolean r11 = r5._idVisible
            java.lang.Boolean r8 = r5._requireTypeIdForSubtypes
            X.GnQ r5 = new X.GnQ
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L4a:
            java.lang.Class<?> r9 = r5._defaultImpl
            if (r9 == 0) goto L6b
            java.lang.Class<X.GrL> r1 = X.AbstractC10200GrL.class
            if (r9 == r1) goto L6b
            boolean r1 = r9.isAnnotation()
            if (r1 != 0) goto L6b
            java.lang.Class<?> r1 = r5._defaultImpl
            if (r9 == r1) goto L6b
            X.Gon r7 = r5._idType
            X.Gow r6 = r5._inclusionType
            java.lang.String r10 = r5._propertyName
            boolean r11 = r5._idVisible
            java.lang.Boolean r8 = r5._requireTypeIdForSubtypes
            X.GnQ r5 = new X.GnQ
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L6b:
            r1 = r0
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder r1 = (com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder) r1
            r1._customIdResolver = r3
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.A01(r5, r1)
            return r0
        L74:
            if (r5 == 0) goto L9b
            X.Gon r0 = r5._idType
            X.Gon r4 = X.EnumC10066Gon.NONE
            if (r0 != r4) goto L8f
            r8 = 0
            java.lang.String r7 = r4._defaultPropertyName
            X.GnQ r2 = new X.GnQ
            r5 = r3
            r6 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder r0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder
            r0.<init>()
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.A01(r2, r0)
            return r0
        L8f:
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder r0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder
            r0.<init>()
            r1 = 0
            r0._typeIdVisible = r1
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.A01(r5, r0)
            goto L1b
        L9b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9888GkO.A00(X.Gkh, X.Go7, X.GkO):X.GoN");
    }

    public static boolean A02(Class<?> cls, Class<?> cls2) {
        if (cls.isPrimitive()) {
            if (cls == AbstractC9855Gj3.A01(cls2)) {
                return true;
            }
        } else if (cls2.isPrimitive() && cls2 == AbstractC9855Gj3.A01(cls)) {
            return true;
        }
        return false;
    }
}
