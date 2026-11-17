package X;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.GgU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9783GgU {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.AbstractC9919GlE r3, X.AbstractC9842Gii r4, java.lang.Object r5) {
        /*
            if (r5 == 0) goto L65
            java.lang.Class r2 = r5.getClass()
            boolean r0 = r4 instanceof X.C9784Ggl
            if (r0 == 0) goto L12
            r0 = r4
            X.Ggl r0 = (X.C9784Ggl) r0
            boolean r1 = r0.mHumanReadableFormatEnabled
            r0 = 1
            if (r1 != 0) goto L13
        L12:
            r0 = 0
        L13:
            boolean r1 = r5 instanceof com.facebook.graphservice.interfaces.Tree
            if (r0 == 0) goto L1e
            if (r1 == 0) goto L1e
        L19:
            X.FXT.A00(r5)
            r0 = 0
            throw r0
        L1e:
            java.lang.Class<X.GgT> r0 = X.InterfaceC9782GgT.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L2a
            com.google.common.base.Preconditions.checkArgument(r1)
            goto L19
        L2a:
            java.lang.Class<X.Bfl> r0 = X.InterfaceC2619Bfl.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L36
            com.facebook.graphservice.staticcontext.StaticGraphServiceFactory.getTreeSerializer()
            goto L19
        L36:
            java.lang.Class<X.Ggu> r0 = X.InterfaceC9786Ggu.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L44
            X.Ggu r5 = (X.InterfaceC9786Ggu) r5
            r5.AcY(r3, r4)
            return
        L44:
            boolean r0 = r2.isEnum()
            if (r0 == 0) goto L54
            java.lang.Enum r5 = (java.lang.Enum) r5
            java.lang.String r0 = r5.name()
            r3.A0s(r0)
            return
        L54:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L62
            java.util.Collection r5 = (java.util.Collection) r5
            A01(r3, r4, r5)
            return
        L62:
            r3.A0j(r5)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9783GgU.A00(X.GlE, X.Gii, java.lang.Object):void");
    }

    public static void A01(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, Collection<?> collection) throws JsonGenerationException {
        if (collection != null) {
            abstractC9919GlE.A0S();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                A00(abstractC9919GlE, abstractC9842Gii, it.next());
            }
            abstractC9919GlE.A0P();
        }
    }
}
