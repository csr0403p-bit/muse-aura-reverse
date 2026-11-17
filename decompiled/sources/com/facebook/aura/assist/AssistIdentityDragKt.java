package com.facebook.aura.assist;

import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.BHP;
import X.BRg;
import X.C3UX;
import X.C3cG;
import X.C78N;
import X.Ey9;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AssistIdentityDragKt {
    public static final BRg assistIdentityMoveActions(BRg bRg, AssistIdentityState assistIdentityState, BFM bfm, int i) {
        int i2;
        boolean zA1a = AnonymousClass002.A1a(bRg, assistIdentityState);
        bfm.AgE(-1717973037);
        if (assistIdentityState.isParked()) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            bfm.AgE(-1704639904);
            Ey9<AssistIdentityEdge> entries = AssistIdentityEdge.getEntries();
            ArrayList arrayListA0i = AnonymousClass003.A0i(entries);
            Iterator<AssistIdentityEdge> it = entries.iterator();
            while (true) {
                boolean z = true;
                if (it.hasNext()) {
                    AssistIdentityEdge next = it.next();
                    int iOrdinal = next.ordinal();
                    if (iOrdinal == 0) {
                        i2 = R.string._name_removed__res_0x7f12017b;
                    } else if (iOrdinal == zA1a) {
                        i2 = R.string._name_removed__res_0x7f12017d;
                    } else if (iOrdinal == 2) {
                        i2 = R.string._name_removed__res_0x7f12017c;
                    } else {
                        if (iOrdinal != 3) {
                            throw C3cG.A0q();
                        }
                        i2 = R.string._name_removed__res_0x7f12017a;
                    }
                    String strA01 = AbstractC2271BQs.A01(bfm, i2);
                    if ((((i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) ^ 48) <= 32 || !bfm.A67(assistIdentityState)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean zA1V = AnonymousClass002.A1V(bfm, c3ux, bfm.A63(iOrdinal), z);
                    Object objAaT2 = bfm.AaT();
                    if (zA1V || objAaT2 == obj) {
                        objAaT2 = new AssistIdentityDragKt$assistIdentityMoveActions$actions$1$1$1(assistIdentityState, next, c3ux);
                        bfm.Ai0(objAaT2);
                    }
                    arrayListA0i.add(new BHP(strA01, (Function0) objAaT2));
                } else {
                    AnonymousClass001.A1D(bfm);
                    boolean zA67 = bfm.A67(arrayListA0i);
                    Object objAaT3 = bfm.AaT();
                    if (zA67 || objAaT3 == obj) {
                        objAaT3 = new AssistIdentityDragKt$assistIdentityMoveActions$1$1(arrayListA0i);
                        bfm.Ai0(objAaT3);
                    }
                    bRg = AnonymousClass001.A0Y(bRg, objAaT3, false);
                }
            }
        }
        AnonymousClass001.A1D(bfm);
        return bRg;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssistIdentityEdge.values().length];
            try {
                AnonymousClass002.A13(AssistIdentityEdge.LEFT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AssistIdentityEdge.TOP, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AssistIdentityEdge.RIGHT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AssistIdentityEdge.BOTTOM, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg assistIdentityDrag(X.BRg r9, com.facebook.aura.assist.AssistIdentityState r10, X.BFM r11, int r12) {
        /*
            boolean r2 = X.AnonymousClass004.A1b(r9, r10)
            java.lang.Object r0 = r11.AaT()
            java.lang.Object r8 = X.C78N.A00
            java.lang.Object r7 = X.AnonymousClass004.A15(r11, r0, r8)
            X.3UX r7 = (X.C3UX) r7
            com.facebook.aura.assist.AssistIdentityDockPosition r6 = r10.dockPosition
            boolean r1 = r11.A67(r6)
            java.lang.Object r0 = r11.AaT()
            if (r1 != 0) goto L1e
            if (r0 != r8) goto L26
        L1e:
            com.facebook.aura.assist.AssistIdentityDragKt$assistIdentityDrag$1$1 r0 = new com.facebook.aura.assist.AssistIdentityDragKt$assistIdentityDrag$1$1
            r0.<init>(r6)
            r11.Ai0(r0)
        L26:
            androidx.compose.runtime.MutableState r1 = X.C1er.A00(r11, r0)
            java.lang.Object r5 = r11.AaT()
            if (r5 != r8) goto L3d
            X.606 r0 = new X.606
            r0.<init>(r1, r2)
            X.5Wa r5 = new X.5Wa
            r5.<init>(r0)
            r11.Ai0(r5)
        L3d:
            X.BV1 r5 = (X.BV1) r5
            boolean r4 = r10.isParked()
            boolean r0 = r11.A67(r6)
            java.lang.Object r3 = r11.AaT()
            if (r0 != 0) goto L4f
            if (r3 != r8) goto L57
        L4f:
            com.facebook.aura.assist.AssistIdentityDragKt$assistIdentityDrag$2$1 r3 = new com.facebook.aura.assist.AssistIdentityDragKt$assistIdentityDrag$2$1
            r3.<init>(r6)
            r11.Ai0(r3)
        L57:
            X.G0U r3 = (X.G0U) r3
            r0 = r12 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L67
            boolean r0 = r11.A67(r10)
            if (r0 != 0) goto L6c
        L67:
            r1 = r12 & 48
            r0 = 0
            if (r1 != r2) goto L6d
        L6c:
            r0 = 1
        L6d:
            boolean r0 = X.AnonymousClass004.A1T(r11, r6, r7, r0)
            java.lang.Object r1 = r11.AaT()
            if (r0 != 0) goto L79
            if (r1 != r8) goto L81
        L79:
            com.facebook.aura.assist.AssistIdentityDragKt$assistIdentityDrag$3$1 r1 = new com.facebook.aura.assist.AssistIdentityDragKt$assistIdentityDrag$3$1
            r1.<init>(r10, r6, r7)
            r11.Ai0(r1)
        L81:
            X.G0U r1 = (X.G0U) r1
            X.AbW r0 = new X.AbW
            r0.<init>(r5, r3, r1, r4)
            X.BRg r0 = r9.then(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.AssistIdentityDragKt.assistIdentityDrag(X.BRg, com.facebook.aura.assist.AssistIdentityState, X.BFM, int):X.BRg");
    }
}
