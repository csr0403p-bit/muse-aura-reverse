package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C3cG;
import X.G0V;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class NodeCardAppHeaderKt {

    /* renamed from: com.facebook.aura.nodes.cards.NodeCardAppHeaderKt$NodeCardAppHeader$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ NodeCardAppResolution $resolution;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NodeCardAppResolution nodeCardAppResolution, BRg bRg, int i, int i2) {
            super(2);
            this.$resolution = nodeCardAppResolution;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NodeCardAppHeaderKt.NodeCardAppHeader(this.$resolution, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NodeCardAppHeader(NodeCardAppResolution nodeCardAppResolution, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass1;
        NodeCardAppInfo nodeCardAppInfo;
        BRg bRg2 = bRg;
        bfm.AgG(-992161138);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, nodeCardAppResolution) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (nodeCardAppResolution == null || (nodeCardAppInfo = nodeCardAppResolution.app) == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass1 = new NodeCardAppHeaderKt$NodeCardAppHeader$app$1(nodeCardAppResolution, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass1);
                }
                return;
            }
            NodeCardComponentsKt.NodeCardAppRow(nodeCardAppInfo.label, nodeCardAppInfo.icon, bRg2, bfm, (iA0T << 3) & 896, 0);
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass1 = new AnonymousClass1(nodeCardAppResolution, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.nodes.cards.NodeCardAppResolution rememberNodeCardApp(com.facebook.aura.nodes.cards.NodeCardAppKind r8, X.BFM r9, int r10) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r8, r0)
            android.content.Context r4 = X.AnonymousClass002.A0H(r9)
            r0 = r10 & 14
            r7 = r0 ^ 6
            r6 = 0
            r5 = 4
            if (r7 <= r5) goto L16
            boolean r0 = X.AnonymousClass002.A1U(r9, r8)
            if (r0 != 0) goto L1b
        L16:
            r1 = r10 & 6
            r0 = 0
            if (r1 != r5) goto L1c
        L1b:
            r0 = 1
        L1c:
            java.lang.Object r3 = r9.AaT()
            r2 = 0
            if (r0 != 0) goto L27
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L31
        L27:
            java.util.concurrent.ConcurrentHashMap<com.facebook.aura.nodes.cards.NodeCardAppKind, com.facebook.aura.nodes.cards.NodeCardAppResolution> r0 = com.facebook.aura.nodes.cards.NodeCardAppCache.cache
            java.lang.Object r0 = r0.get(r8)
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = X.AnonymousClass004.A11(r9, r0)
        L31:
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            boolean r1 = r9.A65(r3)
            if (r7 <= r5) goto L3f
            boolean r0 = X.AnonymousClass002.A1U(r9, r8)
            if (r0 != 0) goto L43
        L3f:
            r0 = r10 & 6
            if (r0 != r5) goto L44
        L43:
            r6 = 1
        L44:
            boolean r1 = X.AnonymousClass002.A1V(r9, r4, r1, r6)
            java.lang.Object r0 = r9.AaT()
            if (r1 != 0) goto L52
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L5a
        L52:
            com.facebook.aura.nodes.cards.NodeCardAppHeaderKt$rememberNodeCardApp$1$1 r0 = new com.facebook.aura.nodes.cards.NodeCardAppHeaderKt$rememberNodeCardApp$1$1
            r0.<init>(r3, r8, r4, r2)
            r9.Ai0(r0)
        L5a:
            X.AnonymousClass001.A18(r9, r0, r8)
            java.lang.Object r0 = r3.getValue()
            boolean r0 = r9.A65(r0)
            java.lang.Object r1 = r9.AaT()
            if (r0 != 0) goto L6f
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L7f
        L6f:
            java.lang.Object r0 = r3.getValue()
            com.facebook.aura.nodes.cards.NodeCardAppResolution r0 = (com.facebook.aura.nodes.cards.NodeCardAppResolution) r0
            if (r0 == 0) goto L7b
            com.facebook.aura.nodes.cards.NodeCardAppResolution r2 = forRender(r0)
        L7b:
            r9.Ai0(r2)
            r1 = r2
        L7f:
            com.facebook.aura.nodes.cards.NodeCardAppResolution r1 = (com.facebook.aura.nodes.cards.NodeCardAppResolution) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.cards.NodeCardAppHeaderKt.rememberNodeCardApp(com.facebook.aura.nodes.cards.NodeCardAppKind, X.BFM, int):com.facebook.aura.nodes.cards.NodeCardAppResolution");
    }

    public static final NodeCardAppResolution forRender(NodeCardAppResolution nodeCardAppResolution) {
        NodeCardAppInfo nodeCardAppInfo = nodeCardAppResolution.app;
        return new NodeCardAppResolution(nodeCardAppInfo != null ? new NodeCardAppInfo(nodeCardAppInfo.label, newDrawableForRender(nodeCardAppInfo.icon)) : null);
    }

    public static final Drawable newDrawableForRender(Drawable drawable) {
        Drawable.ConstantState constantState;
        Drawable drawableNewDrawable;
        if (drawable == null || (constantState = drawable.getConstantState()) == null || (drawableNewDrawable = constantState.newDrawable()) == null) {
            return null;
        }
        return drawableNewDrawable.mutate();
    }

    public static final /* synthetic */ NodeCardAppResolution access$rememberNodeCardApp$lambda$1(MutableState mutableState) {
        return (NodeCardAppResolution) mutableState.getValue();
    }
}
