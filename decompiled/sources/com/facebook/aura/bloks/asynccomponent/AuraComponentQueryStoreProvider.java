package com.facebook.aura.bloks.asynccomponent;

import X.AbstractC0878AGe;
import X.C7687FAg;
import X.C7709FBh;
import X.C7714FBo;
import X.C79;
import X.FBN;
import X.InterfaceC7549F2g;
import java.util.List;

/* loaded from: classes5.dex */
public final class AuraComponentQueryStoreProvider implements InterfaceC7549F2g {
    public FBN store;

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        List listA0X;
        FBN fbn = this.store;
        if (fbn != null) {
            fbn.A04.A01.A02(C79.A00);
            synchronized (fbn.A07) {
                C7709FBh<C7687FAg> c7709FBh = fbn.A05;
                synchronized (c7709FBh.A00) {
                    listA0X = AbstractC0878AGe.A0X(c7709FBh.A01);
                }
                for (C7714FBo c7714FBo : AbstractC0878AGe.A0X(listA0X)) {
                    c7714FBo.A00.invoke(c7714FBo);
                    c7714FBo.A01 = null;
                }
                fbn.A08.run();
            }
            synchronized (fbn.A06) {
                fbn.A09.clear();
            }
        }
        this.store = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0112 A[Catch: all -> 0x01c8, TryCatch #1 {all -> 0x01c8, blocks: (B:7:0x0057, B:9:0x0064, B:10:0x006d, B:12:0x00c0, B:13:0x00e0, B:15:0x00f8, B:17:0x0104, B:19:0x010a, B:21:0x0112, B:23:0x012a, B:24:0x0133, B:31:0x0157, B:32:0x015d, B:33:0x0175, B:35:0x017b, B:37:0x0185, B:38:0x018e, B:25:0x0134, B:26:0x0138, B:28:0x013e, B:30:0x0148), top: B:49:0x0057, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017b A[Catch: all -> 0x01c8, TryCatch #1 {all -> 0x01c8, blocks: (B:7:0x0057, B:9:0x0064, B:10:0x006d, B:12:0x00c0, B:13:0x00e0, B:15:0x00f8, B:17:0x0104, B:19:0x010a, B:21:0x0112, B:23:0x012a, B:24:0x0133, B:31:0x0157, B:32:0x015d, B:33:0x0175, B:35:0x017b, B:37:0x0185, B:38:0x018e, B:25:0x0134, B:26:0x0138, B:28:0x013e, B:30:0x0148), top: B:49:0x0057, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r5v16, types: [X.EEH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.FBN getBloksComponentQueryStore() {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.asynccomponent.AuraComponentQueryStoreProvider.getBloksComponentQueryStore():X.FBN");
    }
}
