package com.facebook.aura.vds.toolbar;

import X.AbstractC07117nq;
import X.G0V;
import X.HtJ;
import X.InterfaceC1074AXb;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vds.toolbar.AuraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1", f = "AuraTitleBar.kt", l = {311}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public AuraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1(HtJ<? super AuraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        AuraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1 auraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1 = new AuraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1(htJ);
        auraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1.L$0 = obj;
        return auraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0043 -> B:6:0x0010). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.L$0
            X.AXb r4 = (X.InterfaceC1074AXb) r4
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 != r2) goto L46
            X.Hwg.A00(r6)
        L10:
            X.Afe r6 = (X.C1247Afe) r6
            java.util.List<X.Agk> r1 = r6.A05
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L21
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L21
        L1e:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L21:
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.next()
            X.Agk r0 = (X.C1299Agk) r0
            boolean r0 = r0.A0F
            if (r0 == 0) goto L25
            goto L39
        L36:
            X.Hwg.A00(r6)
        L39:
            X.AXj r0 = X.EnumC1080AXj.A03
            r5.L$0 = r4
            r5.label = r2
            java.lang.Object r6 = r4.A4z(r0, r5)
            if (r6 != r3) goto L10
            return r3
        L46:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.toolbar.AuraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
        AuraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1 auraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1 = new AuraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1(htJ);
        auraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1.L$0 = interfaceC1074AXb;
        return auraTitleBarKt$TitleBarIcon$4$2$1$1$1$1$isLongPress$1.invokeSuspend(Unit.INSTANCE);
    }
}
