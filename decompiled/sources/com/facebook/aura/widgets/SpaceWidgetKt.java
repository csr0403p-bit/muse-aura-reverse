package com.facebook.aura.widgets;

import X.AbstractC060773g;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AnonymousClass722;
import X.AnonymousClass763;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.C058571g;
import X.C3cG;
import X.C60Q;
import X.C71G;
import X.C71H;
import X.C71J;
import X.C71K;
import X.C71L;
import X.C72Y;
import X.C7384Etj;
import X.C75V;
import X.C76B;
import X.C76C;
import X.C78N;
import X.C7VW;
import X.G0V;
import X.G0W;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.datastore.preferences.core.Preferences;
import com.facebook.aura.R;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.library.repo.UnifiedArtifactKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class SpaceWidgetKt {
    public static final String PEER_SPACE_DEEPLINK_PATH = "peer_space";
    public static final String SPACE_DEEPLINK_PATH = "space";

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetKt$SpaceWidgetContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $appWidgetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, int i2) {
            super(2);
            this.$appWidgetId = i;
            this.$$changed = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceWidgetKt.SpaceWidgetContent(this.$appWidgetId, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetKt$SpaceWidgetContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $appWidgetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, int i2) {
            super(2);
            this.$appWidgetId = i;
            this.$$changed = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceWidgetKt.SpaceWidgetContent(this.$appWidgetId, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetKt$SpaceWidgetContent$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $appWidgetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(int i, int i2) {
            super(2);
            this.$appWidgetId = i;
            this.$$changed = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceWidgetKt.SpaceWidgetContent(this.$appWidgetId, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetKt$SpaceWidgetPanel$1, reason: invalid class name and case insensitive filesystem */
    public final class C144041 extends AbstractC7559F3s implements G0W<C71L, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isRefreshing;
        public final /* synthetic */ boolean $isUnavailable;
        public final /* synthetic */ C71J $onOpen;
        public final /* synthetic */ C71J $onRefresh;
        public final /* synthetic */ C71K $snapshot;
        public final /* synthetic */ String $title;
        public final /* synthetic */ Long $updatedAtMs;

        public final void invoke(C71L c71l, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            WidgetComponentsKt.WidgetHeader(this.$title, this.$updatedAtMs, this.$isRefreshing, this.$onRefresh, null, null, bfm, 0, 48);
            if (this.$isUnavailable) {
                bfm.AgE(-67551498);
                WidgetComponentsKt.WidgetMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12100c), AnonymousClass722.A00(C76B.A00), null, bfm, 0, 4);
            } else {
                bfm.AgE(-67387663);
                SpaceWidgetKt.SpaceWidgetSnapshot(this.$title, this.$snapshot, this.$isRefreshing, this.$onOpen, null, bfm, 0, 16);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144041(String str, Long l, boolean z, C71J c71j, boolean z2, C71K c71k, C71J c71j2) {
            super(3);
            this.$title = str;
            this.$updatedAtMs = l;
            this.$isRefreshing = z;
            this.$onRefresh = c71j;
            this.$isUnavailable = z2;
            this.$snapshot = c71k;
            this.$onOpen = c71j2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C71L c71l, BFM bfm, Integer num) {
            invoke(c71l, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetKt$SpaceWidgetPanel$2, reason: invalid class name and case insensitive filesystem */
    public final class C144052 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isRefreshing;
        public final /* synthetic */ boolean $isUnavailable;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ C71J $onOpen;
        public final /* synthetic */ C71J $onRefresh;
        public final /* synthetic */ C71K $snapshot;
        public final /* synthetic */ String $title;
        public final /* synthetic */ Long $updatedAtMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144052(String str, Long l, boolean z, boolean z2, C71K c71k, C71J c71j, C71J c71j2, C76B c76b, int i, int i2) {
            super(2);
            this.$title = str;
            this.$updatedAtMs = l;
            this.$isRefreshing = z;
            this.$isUnavailable = z2;
            this.$snapshot = c71k;
            this.$onRefresh = c71j;
            this.$onOpen = c71j2;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceWidgetKt.SpaceWidgetPanel(this.$title, this.$updatedAtMs, this.$isRefreshing, this.$isUnavailable, this.$snapshot, this.$onRefresh, this.$onOpen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetKt$SpaceWidgetPreview$1, reason: invalid class name and case insensitive filesystem */
    public final class C144061 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C76B $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144061(C76B c76b, int i, int i2) {
            super(2);
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceWidgetKt.SpaceWidgetPreview(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetKt$SpaceWidgetSnapshot$1, reason: invalid class name and case insensitive filesystem */
    public final class C144071 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isRefreshing;
        public final /* synthetic */ C71J $onOpen;
        public final /* synthetic */ C71J $openAction;
        public final /* synthetic */ C71K $snapshot;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144071(C71K c71k, C71J c71j, String str, boolean z, C71J c71j2) {
            super(2);
            this.$snapshot = c71k;
            this.$openAction = c71j;
            this.$title = str;
            this.$isRefreshing = z;
            this.$onOpen = c71j2;
        }

        public final void invoke(BFM bfm, int i) {
            C76B c76bA00;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$snapshot != null) {
                bfm.AgE(428619339);
                C71K c71k = this.$snapshot;
                C76C c76c = C76B.A00;
                C76B c76bA002 = AnonymousClass722.A00(c76c);
                C71J c71j = this.$openAction;
                if (c71j == null || (c76bA00 = C75V.A00(c76c, c71j)) == null) {
                    c76bA00 = c76c;
                }
                AbstractC060773g.A01(bfm, null, c76bA002.Agp(c76bA00), c71k, this.$title, 0, 0, 16);
            } else if (this.$isRefreshing) {
                bfm.AgE(429146339);
            } else {
                bfm.AgE(845121372);
                WidgetComponentsKt.WidgetMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121007), AnonymousClass722.A00(C76B.A00), this.$onOpen, bfm, 0, 0);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            if (this.$isRefreshing) {
                bfm.AgE(845128184);
                WidgetComponentsKt.WidgetRefreshingOverlay(null, bfm, 0, 1);
            } else {
                bfm.AgE(429193955);
            }
            BBI.A0R(bbiA07, false);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetKt$SpaceWidgetSnapshot$2, reason: invalid class name and case insensitive filesystem */
    public final class C144082 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isRefreshing;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ C71J $onOpen;
        public final /* synthetic */ C71K $snapshot;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144082(String str, C71K c71k, boolean z, C71J c71j, C76B c76b, int i, int i2) {
            super(2);
            this.$title = str;
            this.$snapshot = c71k;
            this.$isRefreshing = z;
            this.$onOpen = c71j;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceWidgetKt.SpaceWidgetSnapshot(this.$title, this.$snapshot, this.$isRefreshing, this.$onOpen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void SpaceWidgetPreview(C76B c76b, BFM bfm, int i, int i2) {
        C76B c76b2 = c76b;
        bfm.AgG(-381698332);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c76b) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            SpaceWidgetPanel(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12100a), null, false, false, new C058571g(R.drawable.space_widget_preview_snapshot), null, null, c76b2, bfm, ((iA0d << 21) & 29360128) | 1772976, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C144061(c76b2, i, i2);
        }
    }

    public static final void SpaceWidgetPanel(String str, Long l, boolean z, boolean z2, C71K c71k, C71J c71j, C71J c71j2, C76B c76b, BFM bfm, int i, int i2) {
        C76B c76b2 = c76b;
        bfm.AgG(-1090036733);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, l);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, c71k, 32768, i) ? 1 : 0);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass002.A02(AnonymousClass004.A1R(bfm, c71j, 262144, i) ? 1 : 0);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A1R(bfm, c71j2, 2097152, i) ? 1048576 : 524288;
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0d |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, c76b2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            C72Y.A00(bfm, WidgetComponentsKt.widgetContainer(c76b2), B1V.A00(bfm, new C144041(str, l, z, c71j, z2, c71k, c71j2), 2002950989), 0, 0, 3072, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C144052(str, l, z, z2, c71k, c71j, c71j2, c76b2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SpaceWidgetSnapshot(java.lang.String r14, X.C71K r15, boolean r16, X.C71J r17, X.C76B r18, X.BFM r19, int r20, int r21) {
        /*
            r8 = r18
            r0 = 644671905(0x266ce9a1, float:8.2195574E-16)
            r1 = r19
            r1.AgG(r0)
            r9 = r20
            r0 = r20 & 6
            r4 = r14
            if (r0 != 0) goto L97
            int r3 = X.AnonymousClass004.A0d(r1, r14)
            r3 = r3 | r20
        L17:
            r0 = r20 & 48
            r5 = r15
            if (r0 != 0) goto L25
            boolean r0 = X.AnonymousClass004.A1Y(r15, r1, r9)
            int r0 = X.AnonymousClass002.A06(r0)
            r3 = r3 | r0
        L25:
            r0 = r9 & 384(0x180, float:5.38E-43)
            r6 = r16
            if (r0 != 0) goto L30
            int r0 = X.AnonymousClass004.A0p(r1, r6)
            r3 = r3 | r0
        L30:
            r0 = r9 & 3072(0xc00, float:4.305E-42)
            r7 = r17
            if (r0 != 0) goto L3f
            boolean r0 = X.AnonymousClass004.A1a(r7, r1, r9)
            int r0 = X.AnonymousClass002.A00(r0)
            r3 = r3 | r0
        L3f:
            r10 = r21
            r2 = r21 & 16
            if (r2 == 0) goto L8d
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L47:
            boolean r0 = X.AnonymousClass004.A1N(r3)
            boolean r0 = X.AnonymousClass001.A1b(r0, r1, r3)
            if (r0 == 0) goto L89
            if (r2 == 0) goto L55
            X.76C r8 = X.C76B.A00
        L55:
            r18 = 0
            if (r17 == 0) goto L5c
            r13 = r7
            if (r16 == 0) goto L5e
        L5c:
            r13 = r18
        L5e:
            X.76B r17 = X.AnonymousClass722.A00(r8)
            com.facebook.aura.widgets.SpaceWidgetKt$SpaceWidgetSnapshot$1 r11 = new com.facebook.aura.widgets.SpaceWidgetKt$SpaceWidgetSnapshot$1
            r12 = r15
            r15 = r6
            r16 = r7
            r11.<init>(r12, r13, r14, r15, r16)
            r0 = -1000236801(0xffffffffc46198ff, float:-902.39056)
            X.B1U r19 = X.B1V.A00(r1, r11, r0)
            r20 = 384(0x180, float:5.38E-43)
            r21 = 2
            r16 = r1
            X.C72G.A00(r16, r17, r18, r19, r20, r21)
        L7b:
            X.BBb r0 = r1.AAc()
            if (r0 == 0) goto L88
            com.facebook.aura.widgets.SpaceWidgetKt$SpaceWidgetSnapshot$2 r3 = new com.facebook.aura.widgets.SpaceWidgetKt$SpaceWidgetSnapshot$2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.A06 = r3
        L88:
            return
        L89:
            r1.Afo()
            goto L7b
        L8d:
            r0 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L47
            int r0 = X.AnonymousClass004.A0h(r1, r8)
            r3 = r3 | r0
            goto L47
        L97:
            r3 = r9
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetKt.SpaceWidgetSnapshot(java.lang.String, X.71K, boolean, X.71J, X.76B, X.BFM, int, int):void");
    }

    public static final void SpaceWidgetContent(int i, BFM bfm, int i2) {
        BBb bBbAAc;
        Object anonymousClass5;
        bfm.AgG(122571655);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 3, 2), bfm, iA0D)) {
            Context contextA08 = C60Q.A08(bfm);
            bfm.AgF(-534706435);
            Object objA6v = bfm.A6v(C7VW.A03);
            if (objA6v == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
            }
            Preferences preferences = (Preferences) objA6v;
            BBI bbiA07 = C3cG.A07(bfm);
            SpaceWidgetStore spaceWidgetStore = SpaceWidgetStore.INSTANCE;
            String str = (String) preferences.A06(SpaceWidgetStore.SLUG);
            String str2 = (String) preferences.A06(SpaceWidgetStore.TITLE);
            if (C7384Etj.areEqual(preferences.A06(SpaceWidgetStore.SIGNED_OUT), true)) {
                bfm.AgE(810235418);
                WidgetComponentsKt.WidgetMessage(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12100b), WidgetComponentsKt.widgetContainer(C76B.A00), WidgetComponentsKt.openAppAction(contextA08), bfm, 0, 0);
                bBbAAc = AnonymousClass001.A0L(bfm, bbiA07);
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass5 = new AnonymousClass1(i, i2);
                }
            } else {
                bfm.AgE(810451643);
                BBI.A0R(bbiA07, false);
                if (str == null || str2 == null) {
                    bfm.AgE(810498980);
                    WidgetComponentsKt.WidgetMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121004), WidgetComponentsKt.widgetContainer(C76B.A00), AnonymousClass763.A00(SpaceWidgetConfigureActivity.Companion.reconfigureIntent(contextA08, i)), bfm, 0, 0);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbiA07);
                    if (bBbAAc == null) {
                        return;
                    } else {
                        anonymousClass5 = new AnonymousClass2(i, i2);
                    }
                } else {
                    bfm.AgE(810797851);
                    BBI.A0R(bbiA07, false);
                    Long l = (Long) preferences.A06(SpaceWidgetStore.UPDATED_AT_MS);
                    boolean zA1R = AnonymousClass001.A1R(bfm, l, AnonymousClass003.A1B(iA0D));
                    Object objAaT = bfm.AaT();
                    if (zA1R || objAaT == C78N.A00) {
                        objAaT = spaceWidgetStore.loadSnapshot(contextA08, i, l);
                        bfm.Ai0(objAaT);
                    }
                    Bitmap bitmap = (Bitmap) objAaT;
                    boolean zA03 = Preferences.A03(SpaceWidgetStore.REFRESHING, preferences, true);
                    boolean zA032 = Preferences.A03(SpaceWidgetStore.UNAVAILABLE, preferences, true);
                    C71G c71g = bitmap != null ? new C71G(bitmap) : null;
                    C71H c71h = new C71H(SpaceWidgetReceiver.Companion.refreshIntent(contextA08, i));
                    ArtifactOpenTarget.PeerSpace peerSpacePeerSpaceTargetFromItemKey = UnifiedArtifactKt.peerSpaceTargetFromItemKey(str);
                    Uri uriBuild = WidgetComponentsKt.auraUri(peerSpacePeerSpaceTargetFromItemKey != null ? new String[]{"peer_space", peerSpacePeerSpaceTargetFromItemKey.hostMuse, peerSpacePeerSpaceTargetFromItemKey.spaceId} : new String[]{"space", str}).build();
                    C7384Etj.A0U(uriBuild);
                    SpaceWidgetPanel(str2, l, zA03, zA032, c71g, c71h, WidgetComponentsKt.auraDeeplinkAction(contextA08, uriBuild, SpaceHomeScreenWidget.INSTANCE.getKind()), null, bfm, 0, 128);
                }
            }
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(i, i2);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }
}
