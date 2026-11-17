package com.facebook.aura.watchhandoff;

import X.AbstractC07127nr;
import X.AbstractC2947Bpi;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C1er;
import X.C3009Brr;
import X.C3UX;
import X.C4443CwA;
import X.C6ys;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7Bm;
import X.CFK;
import X.E91;
import X.G0U;
import X.G0V;
import X.GAX;
import X.GBL;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.accountcenter.MC;
import com.facebook.aura.conversation.widget.api.ConversationCardControls;
import com.facebook.aura.nudge.ConversationNudge;
import com.facebook.aura.nudge.NudgeExpiry;
import com.facebook.aura.nudge.NudgeOutcome;
import com.facebook.aura.nudge.NudgePolicy;
import com.facebook.aura.nudge.NudgePresentation;
import com.facebook.aura.nudge.NudgeSurface;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.utils.HatchWatchAppPromoUtils;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class WatchAppPromoNudge implements ConversationNudge {
    public final String id;
    public final NudgePolicy policy;
    public final NudgePresentation presentation;
    public final int priority;
    public volatile boolean watchAppInstalled;

    @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchAppPromoNudge$connectedWatches$2", f = "WatchAppPromoNudge.kt", l = {236, 244}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.watchhandoff.WatchAppPromoNudge$connectedWatches$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConnectedWatches>, Object> {
        public final /* synthetic */ Context $context;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ConnectedWatches> htJ) {
            return new AnonymousClass2(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007a A[Catch: Exception -> 0x00dd, CancellationException -> 0x00ea, LOOP:0: B:22:0x0074->B:24:0x007a, LOOP_END, TryCatch #2 {CancellationException -> 0x00ea, Exception -> 0x00dd, blocks: (B:20:0x0060, B:21:0x0063, B:22:0x0074, B:24:0x007a, B:25:0x0088, B:26:0x009c, B:28:0x00a2, B:29:0x00b0, B:30:0x00bc, B:32:0x00c2, B:34:0x00cf, B:35:0x00d3, B:36:0x00d7, B:13:0x0034, B:14:0x0037, B:17:0x0040, B:10:0x001a), top: B:43:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[Catch: Exception -> 0x00dd, CancellationException -> 0x00ea, LOOP:1: B:26:0x009c->B:28:0x00a2, LOOP_END, TryCatch #2 {CancellationException -> 0x00ea, Exception -> 0x00dd, blocks: (B:20:0x0060, B:21:0x0063, B:22:0x0074, B:24:0x007a, B:25:0x0088, B:26:0x009c, B:28:0x00a2, B:29:0x00b0, B:30:0x00bc, B:32:0x00c2, B:34:0x00cf, B:35:0x00d3, B:36:0x00d7, B:13:0x0034, B:14:0x0037, B:17:0x0040, B:10:0x001a), top: B:43:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c2 A[Catch: Exception -> 0x00dd, CancellationException -> 0x00ea, TryCatch #2 {CancellationException -> 0x00ea, Exception -> 0x00dd, blocks: (B:20:0x0060, B:21:0x0063, B:22:0x0074, B:24:0x007a, B:25:0x0088, B:26:0x009c, B:28:0x00a2, B:29:0x00b0, B:30:0x00bc, B:32:0x00c2, B:34:0x00cf, B:35:0x00d3, B:36:0x00d7, B:13:0x0034, B:14:0x0037, B:17:0x0040, B:10:0x001a), top: B:43:0x0007 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r9.label
                r8 = 0
                r6 = 2
                r7 = 1
                if (r0 == 0) goto L17
                if (r0 == r7) goto L34
                if (r0 != r6) goto L12
                java.lang.Object r2 = r9.L$0
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                goto L60
            L12:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L17:
                X.Hwg.A00(r10)
                android.content.Context r4 = r9.$context     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                X.Cs4 r3 = X.C4276Cs4.A02     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                X.CrC<X.Cs8> r2 = X.AbstractC4267Crq.A00     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                X.Cs8 r1 = X.C4278Cs8.A00     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                X.Cop r0 = new X.Cop     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                r0.<init>(r4, r1, r2, r3)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                X.CSC r0 = r0.A05()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                r9.label = r7     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                java.lang.Object r10 = X.AbstractC3001Brc.A00(r0, r9)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                if (r10 != r5) goto L37
                return r5
            L34:
                X.Hwg.A00(r10)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
            L37:
                java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                boolean r0 = r10.isEmpty()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                if (r0 == 0) goto L40
                return r8
            L40:
                android.content.Context r4 = r9.$context     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                X.Cs4 r3 = X.C4276Cs4.A02     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                X.CrC<X.Cs8> r2 = X.AbstractC4267Crq.A00     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                X.Cs8 r0 = X.C4278Cs8.A00     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                X.Cos r1 = new X.Cos     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                r1.<init>(r4, r0, r2, r3)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                java.lang.String r0 = "aura_watch_session_v1"
                X.CSC r0 = r1.A05(r0, r7)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                r9.L$0 = r10     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                r9.label = r6     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                java.lang.Object r0 = X.AbstractC3001Brc.A00(r0, r9)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                if (r0 == r5) goto Ldc
                r2 = r10
                r10 = r0
                goto L63
            L60:
                X.Hwg.A00(r10)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
            L63:
                X.CmR r10 = (X.InterfaceC4097CmR) r10     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                java.util.Set r0 = r10.AI8()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                X.C7384Etj.A0U(r0)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                java.util.HashSet r5 = X.C60O.A13()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
            L74:
                boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                if (r0 == 0) goto L88
                java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                X.Caw r0 = (X.InterfaceC3641Caw) r0     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                com.google.android.gms.wearable.internal.zzhg r0 = (com.google.android.gms.wearable.internal.zzhg) r0     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                java.lang.String r0 = r0.A00     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                r5.add(r0)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                goto L74
            L88:
                X.C7384Etj.A0X(r2)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                com.facebook.aura.watchhandoff.WatchAppPromoNudge$connectedWatches$2$invokeSuspend$$inlined$sortedByDescending$1 r0 = new com.facebook.aura.watchhandoff.WatchAppPromoNudge$connectedWatches$2$invokeSuspend$$inlined$sortedByDescending$1     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                r0.<init>()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                java.util.List r0 = X.AbstractC0878AGe.A0c(r2, r0)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                java.util.ArrayList r2 = X.AnonymousClass003.A0i(r0)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
            L9c:
                boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                if (r0 == 0) goto Lb0
                java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                X.Caw r0 = (X.InterfaceC3641Caw) r0     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                com.google.android.gms.wearable.internal.zzhg r0 = (com.google.android.gms.wearable.internal.zzhg) r0     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                java.lang.String r0 = r0.A00     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                r2.add(r0)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                goto L9c
            Lb0:
                java.util.ArrayList r4 = X.C3cG.A0h()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                java.util.ArrayList r3 = X.C3cG.A0h()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
            Lbc:
                boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                if (r0 == 0) goto Ld7
                java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                r0 = r1
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                boolean r0 = r5.contains(r0)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                if (r0 == 0) goto Ld3
                r4.add(r1)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                goto Lbc
            Ld3:
                r3.add(r1)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                goto Lbc
            Ld7:
                com.facebook.aura.watchhandoff.ConnectedWatches r5 = new com.facebook.aura.watchhandoff.ConnectedWatches     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
                r5.<init>(r4, r3)     // Catch: java.lang.Exception -> Ldd java.util.concurrent.CancellationException -> Lea
            Ldc:
                return r5
            Ldd:
                r0 = move-exception
                java.lang.String r2 = X.C3cI.A0Y(r0)
                java.lang.String r1 = "WatchAppPromoNudge"
                java.lang.String r0 = "Wearable API unavailable: %s"
                X.CFK.A03(r2, r1, r0)
                return r8
            Lea:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchhandoff.WatchAppPromoNudge.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.facebook.aura.watchhandoff.WatchAppPromoNudge$content$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isSheet;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z) {
            super(2);
            this.$isSheet = z;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            BRg bRg;
            float f;
            float f2;
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                if (this.$isSheet) {
                    bfm.AgE(166275700);
                    bRg = null;
                    f = 88.0f;
                    f2 = 40.0f;
                } else {
                    bfm.AgE(166278068);
                    bRg = null;
                    f = 44.0f;
                    f2 = 22.0f;
                }
                WatchAppPromoNudgeKt.m3149WatchAppPromoAvatarif577FI(f, f2, bRg, bfm, 54, 4);
                AnonymousClass002.A19(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchAppPromoNudge", f = "WatchAppPromoNudge.kt", l = {143}, m = "isEligible", v = 2)
    /* renamed from: com.facebook.aura.watchhandoff.WatchAppPromoNudge$isEligible$1, reason: invalid class name and case insensitive filesystem */
    public final class C143511 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C143511(HtJ<? super C143511> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchAppPromoNudge.this.isEligible(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchAppPromoNudge", f = "WatchAppPromoNudge.kt", l = {276}, m = "openChatOnWatch", v = 2)
    /* renamed from: com.facebook.aura.watchhandoff.WatchAppPromoNudge$openChatOnWatch$1, reason: invalid class name and case insensitive filesystem */
    public final class C143521 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C143521(HtJ<? super C143521> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchAppPromoNudge.this.openChatOnWatch(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchAppPromoNudge", f = "WatchAppPromoNudge.kt", l = {259, MC.mwa_accounts_center_settings.__CONFIG__}, m = "openOnWatch", v = 2)
    /* renamed from: com.facebook.aura.watchhandoff.WatchAppPromoNudge$openOnWatch$1, reason: invalid class name and case insensitive filesystem */
    public final class C143531 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C143531(HtJ<? super C143531> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchAppPromoNudge.this.openOnWatch(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchAppPromoNudge", f = "WatchAppPromoNudge.kt", l = {290}, m = "openStore", v = 2)
    /* renamed from: com.facebook.aura.watchhandoff.WatchAppPromoNudge$openStore$1, reason: invalid class name and case insensitive filesystem */
    public final class C143541 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C143541(HtJ<? super C143541> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchAppPromoNudge.this.openStore(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchAppPromoNudge", f = "WatchAppPromoNudge.kt", l = {152}, m = "watchBlocker", v = 2)
    /* renamed from: com.facebook.aura.watchhandoff.WatchAppPromoNudge$watchBlocker$1, reason: invalid class name and case insensitive filesystem */
    public final class C143551 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C143551(HtJ<? super C143551> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchAppPromoNudge.this.watchBlocker(null, this);
        }
    }

    public WatchAppPromoNudge(String str, NudgePresentation nudgePresentation) {
        boolean zA1a = AnonymousClass002.A1a(str, nudgePresentation);
        this.id = str;
        this.presentation = nudgePresentation;
        this.priority = 20;
        this.policy = new NudgePolicy(zA1a ? 1 : 0, 0, new NudgeExpiry(nudgePresentation == NudgePresentation.SHEET ? 600000L : 60000L, zA1a), zA1a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object connectedWatches(Context context, HtJ<? super ConnectedWatches> htJ) {
        return GAX.A01(htJ, new AnonymousClass2(context, null), 5000L);
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* bridge */ void onDeclined() {
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public Function0<Unit> rememberAction(G0U<? super NudgeOutcome, Unit> g0u, BFM bfm, int i) {
        C7384Etj.A0Y(g0u, 0);
        bfm.AgE(425504599);
        Context context = (Context) bfm.A6v(AndroidCompositionLocals_androidKt.A01);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = C78e.A00(bfm, C6ys.A00);
            bfm.Ai0(objAaT);
        }
        C3UX c3ux = (C3UX) objAaT;
        MutableState mutableStateA00 = C1er.A00(bfm, g0u);
        boolean zA67 = bfm.A67(c3ux) | bfm.A67(this) | bfm.A67(context) | bfm.A65(mutableStateA00);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == obj) {
            objAaT2 = new WatchAppPromoNudge$rememberAction$1$1(c3ux, this, context, mutableStateA00);
            bfm.Ai0(objAaT2);
        }
        Function0<Unit> function0 = (Function0) objAaT2;
        BBI.A0R((BBI) bfm, false);
        return function0;
    }

    private final String installedWatchBlocker() {
        int iWatchAppPromoInstalledUsersMode = HatchUtil.INSTANCE.watchAppPromoInstalledUsersMode();
        if (iWatchAppPromoInstalledUsersMode == 1) {
            HatchWatchAppPromoUtils.INSTANCE.markShown();
            return "watch_app_installed_marked_seen";
        }
        if (iWatchAppPromoInstalledUsersMode != 2) {
            return WatchAppPromoNudgeKt.LOG_KEY_WATCH_APP_INSTALLED;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object openChatOnWatch(android.content.Context r6, java.lang.String r7, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.watchhandoff.WatchAppPromoNudge.C143521
            if (r0 == 0) goto L1e
            r4 = r8
            com.facebook.aura.watchhandoff.WatchAppPromoNudge$openChatOnWatch$1 r4 = (com.facebook.aura.watchhandoff.WatchAppPromoNudge.C143521) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L28
            goto L24
        L1e:
            com.facebook.aura.watchhandoff.WatchAppPromoNudge$openChatOnWatch$1 r4 = new com.facebook.aura.watchhandoff.WatchAppPromoNudge$openChatOnWatch$1
            r4.<init>(r8)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4e
            goto L49
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.watchlink.WatchLinkClient r1 = com.facebook.aura.watchlink.WatchLinkClient.INSTANCE     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4e
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4e
            r4.L$1 = r0     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4e
            r4.label = r2     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4e
            java.lang.Object r0 = r1.openChat(r6, r7, r4)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4e
            if (r0 != r3) goto L49
            return r3
        L40:
            r2 = move-exception
            java.lang.String r1 = "Unable to open the app on the watch"
            java.lang.String r0 = "WatchAppPromoNudge"
            X.CFK.A0A(r0, r1, r2)
            r2 = 0
        L49:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            return r3
        L4e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchhandoff.WatchAppPromoNudge.openChatOnWatch(android.content.Context, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object openOnWatch(android.content.Context r8, X.HtJ<? super com.facebook.aura.nudge.NudgeOutcome> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.watchhandoff.WatchAppPromoNudge.C143531
            if (r0 == 0) goto L69
            r6 = r9
            com.facebook.aura.watchhandoff.WatchAppPromoNudge$openOnWatch$1 r6 = (com.facebook.aura.watchhandoff.WatchAppPromoNudge.C143531) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 == r0) goto L43
            if (r1 != r3) goto L7a
            X.Hwg.A00(r5)
        L23:
            if (r5 != 0) goto L33
            java.lang.String r2 = "none"
        L27:
            java.lang.String r1 = "WatchAppPromoNudge"
            java.lang.String r0 = "Watch app opened on watch=%s"
            X.CFK.A03(r2, r1, r0)
            if (r5 != 0) goto L6f
            com.facebook.aura.nudge.NudgeOutcome r4 = com.facebook.aura.nudge.NudgeOutcome.FAILED
            return r4
        L33:
            r2 = r5
            goto L27
        L35:
            X.Hwg.A00(r5)
            r6.L$0 = r8
            r6.label = r0
            java.lang.Object r5 = r7.connectedWatches(r8, r6)
            if (r5 != r4) goto L4a
            return r4
        L43:
            java.lang.Object r8 = r6.L$0
            android.content.Context r8 = (android.content.Context) r8
            X.Hwg.A00(r5)
        L4a:
            com.facebook.aura.watchhandoff.ConnectedWatches r5 = (com.facebook.aura.watchhandoff.ConnectedWatches) r5
            r1 = 0
            if (r5 == 0) goto L53
            java.util.List<java.lang.String> r0 = r5.withMuse
            if (r0 != 0) goto L55
        L53:
            X.AGi r0 = X.C0881AGi.A00
        L55:
            com.facebook.aura.watchhandoff.WatchAppPromoNudge$openOnWatch$watch$1 r2 = new com.facebook.aura.watchhandoff.WatchAppPromoNudge$openOnWatch$watch$1
            r2.<init>(r0, r7, r8, r1)
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r3
            r0 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Object r5 = X.GAX.A01(r6, r2, r0)
            if (r5 != r4) goto L23
            return r4
        L69:
            com.facebook.aura.watchhandoff.WatchAppPromoNudge$openOnWatch$1 r6 = new com.facebook.aura.watchhandoff.WatchAppPromoNudge$openOnWatch$1
            r6.<init>(r9)
            goto L12
        L6f:
            com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
            r0 = 2131890514(0x7f121152, float:1.9415722E38)
            r1.showToast(r0)
            com.facebook.aura.nudge.NudgeOutcome r4 = com.facebook.aura.nudge.NudgeOutcome.COMPLETED
            return r4
        L7a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchhandoff.WatchAppPromoNudge.openOnWatch(android.content.Context, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object openStore(android.content.Context r8, X.HtJ<? super com.facebook.aura.nudge.NudgeOutcome> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.watchhandoff.WatchAppPromoNudge.C143541
            if (r0 == 0) goto L85
            r3 = r9
            com.facebook.aura.watchhandoff.WatchAppPromoNudge$openStore$1 r3 = (com.facebook.aura.watchhandoff.WatchAppPromoNudge.C143541) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r6 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r5 = 1
            if (r0 == 0) goto L4b
            if (r0 != r5) goto L8b
            java.lang.Object r8 = r3.L$0
            android.content.Context r8 = (android.content.Context) r8
            X.Hwg.A00(r6)
        L24:
            if (r6 != 0) goto L49
            java.lang.String r2 = "none"
        L28:
            java.lang.String r1 = "WatchAppPromoNudge"
            java.lang.String r0 = "Play listing opened on watch=%s"
            X.CFK.A03(r2, r1, r0)
            if (r6 == 0) goto L3c
            com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
            r0 = 2131890513(0x7f121151, float:1.941572E38)
            r1.showToast(r0)
        L39:
            com.facebook.aura.nudge.NudgeOutcome r4 = com.facebook.aura.nudge.NudgeOutcome.UNKNOWN
            return r4
        L3c:
            java.lang.String r0 = r8.getPackageName()
            boolean r0 = com.facebook.aura.common.url.PlayStoreListingKt.openPlayStoreListing(r8, r0)
            if (r0 != 0) goto L39
            com.facebook.aura.nudge.NudgeOutcome r4 = com.facebook.aura.nudge.NudgeOutcome.FAILED
            return r4
        L49:
            r2 = r6
            goto L28
        L4b:
            X.Hwg.A00(r6)
            java.lang.String r1 = r8.getPackageName()
            java.lang.String r0 = "market://details?id="
            java.lang.String r0 = X.FGI.A0M(r0, r1)
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            r0 = 13
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.content.Intent r1 = r1.addCategory(r0)
            X.C7384Etj.A0U(r1)
            r0 = 0
            com.facebook.aura.watchhandoff.WatchAppPromoNudge$openStore$watch$1 r2 = new com.facebook.aura.watchhandoff.WatchAppPromoNudge$openStore$watch$1
            r2.<init>(r7, r8, r1, r0)
            r3.L$0 = r8
            r3.L$1 = r0
            r3.label = r5
            r0 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Object r6 = X.GAX.A01(r3, r2, r0)
            if (r6 != r4) goto L24
            return r4
        L85:
            com.facebook.aura.watchhandoff.WatchAppPromoNudge$openStore$1 r3 = new com.facebook.aura.watchhandoff.WatchAppPromoNudge$openStore$1
            r3.<init>(r9)
            goto L12
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchhandoff.WatchAppPromoNudge.openStore(android.content.Context, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object watchBlocker(android.content.Context r7, X.HtJ<? super java.lang.String> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.watchhandoff.WatchAppPromoNudge.C143551
            if (r0 == 0) goto L3d
            r3 = r8
            com.facebook.aura.watchhandoff.WatchAppPromoNudge$watchBlocker$1 r3 = (com.facebook.aura.watchhandoff.WatchAppPromoNudge.C143551) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r1 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 != r4) goto L69
            X.Hwg.A00(r1)
        L21:
            com.facebook.aura.watchhandoff.ConnectedWatches r1 = (com.facebook.aura.watchhandoff.ConnectedWatches) r1
            if (r1 != 0) goto L43
            java.lang.String r0 = "no_watch"
            return r0
        L28:
            X.Hwg.A00(r1)
            com.facebook.aura.watchhandoff.WatchesAtColdStart r1 = com.facebook.aura.watchhandoff.WatchesAtColdStart.INSTANCE
            com.facebook.aura.watchhandoff.WatchAppPromoNudge$watchBlocker$watches$1 r0 = new com.facebook.aura.watchhandoff.WatchAppPromoNudge$watchBlocker$watches$1
            r0.<init>(r6, r7, r5)
            r3.L$0 = r5
            r3.label = r4
            java.lang.Object r1 = r1.get(r0, r3)
            if (r1 != r2) goto L21
            return r2
        L3d:
            com.facebook.aura.watchhandoff.WatchAppPromoNudge$watchBlocker$1 r3 = new com.facebook.aura.watchhandoff.WatchAppPromoNudge$watchBlocker$1
            r3.<init>(r8)
            goto L12
        L43:
            java.util.List<java.lang.String> r0 = r1.withMuse
            boolean r0 = r0.isEmpty()
            r3 = r0 ^ 1
            if (r0 != 0) goto L54
            java.lang.String r0 = r6.installedWatchBlocker()
            if (r0 == 0) goto L54
            return r0
        L54:
            com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r2 = r0.isWatchAppPromoSheetEnabled()
            com.facebook.aura.nudge.NudgePresentation r1 = r6.presentation
            com.facebook.aura.nudge.NudgePresentation r0 = com.facebook.aura.nudge.NudgePresentation.SHEET
            if (r1 == r0) goto L61
            r4 = 0
        L61:
            if (r2 == r4) goto L66
            java.lang.String r0 = "other_presentation"
            return r0
        L66:
            r6.watchAppInstalled = r3
            return r5
        L69:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchhandoff.WatchAppPromoNudge.watchBlocker(android.content.Context, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public String getId() {
        return this.id;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public NudgePolicy getPolicy() {
        return this.policy;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public int getPriority() {
        return this.priority;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* bridge */ Set<NudgeSurface> getSurfaces() {
        return Collections.singleton(NudgeSurface.PHONE);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    @Override // com.facebook.aura.nudge.ConversationNudge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object isEligible(android.content.Context r8, X.AbstractC3358CGz r9, X.HtJ<? super java.lang.Boolean> r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.watchhandoff.WatchAppPromoNudge.C143511
            if (r0 == 0) goto L78
            r4 = r10
            com.facebook.aura.watchhandoff.WatchAppPromoNudge$isEligible$1 r4 = (com.facebook.aura.watchhandoff.WatchAppPromoNudge.C143511) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r6 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 != r3) goto L7e
            X.Hwg.A00(r6)
        L20:
            java.lang.String r4 = r7.getId()
            if (r6 != 0) goto L37
            java.lang.String r2 = "none"
        L28:
            java.lang.String r1 = "WatchAppPromoNudge"
            java.lang.String r0 = "Eligibility nudge=%s blocker=%s"
            X.CFK.A02(r4, r2, r1, r0)
            if (r6 == 0) goto L32
            r3 = 0
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L37:
            r2 = r6
            goto L28
        L39:
            X.Hwg.A00(r6)
            com.facebook.aura.utils.HatchUtil r1 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r0 = r1.isWatchAppPromoEnabled()
            if (r0 != 0) goto L47
            java.lang.String r6 = "mobile_config"
            goto L20
        L47:
            com.facebook.aura.utils.HatchWatchAppPromoUtils r2 = com.facebook.aura.utils.HatchWatchAppPromoUtils.INSTANCE
            boolean r0 = r2.isShown()
            if (r0 == 0) goto L52
            java.lang.String r6 = "done"
            goto L20
        L52:
            long r0 = r1.watchAppPromoPromptCount()
            boolean r0 = r2.hasPromptedMoreThan(r0)
            if (r0 != 0) goto L5f
            java.lang.String r6 = "prompt_count"
            goto L20
        L5f:
            com.facebook.aura.watchhandoff.WatchHandoffGate r0 = com.facebook.aura.watchhandoff.WatchHandoffGate.INSTANCE
            boolean r0 = r0.canSetUpWatch(r9)
            if (r0 != 0) goto L6a
            java.lang.String r6 = "handoff_unavailable"
            goto L20
        L6a:
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r3
            java.lang.Object r6 = r7.watchBlocker(r8, r4)
            if (r6 != r5) goto L20
            return r5
        L78:
            com.facebook.aura.watchhandoff.WatchAppPromoNudge$isEligible$1 r4 = new com.facebook.aura.watchhandoff.WatchAppPromoNudge$isEligible$1
            r4.<init>(r10)
            goto L12
        L7e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchhandoff.WatchAppPromoNudge.isEligible(android.content.Context, X.CGz, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public Map<String, String> logMetadata() {
        return AnonymousClass006.A10(WatchAppPromoNudgeKt.LOG_KEY_WATCH_APP_INSTALLED, String.valueOf(this.watchAppInstalled));
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public void onReset() {
        HatchWatchAppPromoUtils.INSTANCE.clear();
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public void onShown() {
        HatchWatchAppPromoUtils.INSTANCE.markShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startRemoteActivity(Context context, Intent intent, String str, HtJ<? super Boolean> htJ) {
        C4443CwA c4443CwA = new C4443CwA(AnonymousClass001.A0I(context), new Executor() { // from class: com.facebook.aura.watchhandoff.WatchAppPromoNudge$startRemoteActivity$future$1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        });
        C7384Etj.A0Y(intent, 0);
        final C3009Brr c3009BrrA00 = AbstractC2947Bpi.A00(new E91(intent, c4443CwA, str, 0));
        final GBL gblA03 = C7Bm.A03(htJ);
        gblA03.AO2(new WatchAppPromoNudge$startRemoteActivity$2$1(c3009BrrA00));
        c3009BrrA00.addListener(new Runnable() { // from class: com.facebook.aura.watchhandoff.WatchAppPromoNudge$startRemoteActivity$2$2
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, InterruptedException {
                boolean z;
                if (c3009BrrA00.isCancelled()) {
                    return;
                }
                try {
                    c3009BrrA00.get();
                    z = true;
                } catch (Exception e) {
                    CFK.A0A(WatchAppPromoNudgeKt.TAG, "Unable to open the Play Store on the watch", e);
                    z = false;
                }
                gblA03.resumeWith(Boolean.valueOf(z));
            }
        }, new Executor() { // from class: com.facebook.aura.watchhandoff.WatchAppPromoNudge$startRemoteActivity$2$3
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        });
        return gblA03.A0F();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    @Override // com.facebook.aura.nudge.ConversationNudge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.aura.nudge.NudgeContent content(X.BFM r14, int r15) {
        /*
            r13 = this;
            r0 = -1078597506(0xffffffffbfb5e87e, float:-1.4211576)
            r14.AgE(r0)
            boolean r3 = r13.watchAppInstalled
            com.facebook.aura.nudge.NudgePresentation r2 = r13.presentation
            com.facebook.aura.nudge.NudgePresentation r0 = com.facebook.aura.nudge.NudgePresentation.SHEET
            r10 = 1
            r1 = 0
            boolean r4 = X.AnonymousClass002.A1Z(r2, r0)
            com.facebook.aura.identity.provider.HatchIdentityProvider$Companion r2 = com.facebook.aura.identity.provider.HatchIdentityProvider.Companion
            X.AKH<X.CGz> r0 = com.facebook.aura.session.LocalUserSessionKt.LocalUserSession
            java.lang.Object r0 = r14.A6v(r0)
            X.CGz r0 = (X.AbstractC3358CGz) r0
            com.facebook.aura.identity.provider.HatchIdentityProvider r0 = r2.getInstance(r0)
            X.1BN<java.lang.String> r0 = r0.aiIdentityName
            X.1BO r0 = X.C2CK.A02(r14, r0)
            if (r4 != 0) goto L2d
            r2 = 2131890516(0x7f121154, float:1.9415726E38)
            if (r3 == 0) goto L30
        L2d:
            r2 = 2131890515(0x7f121153, float:1.9415724E38)
        L30:
            java.lang.Object r0 = r0.getValue()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r5 = X.AbstractC2271BQs.A02(r14, r0, r2)
            r0 = 2131890511(0x7f12114f, float:1.9415716E38)
            if (r3 == 0) goto L44
            r0 = 2131890517(0x7f121155, float:1.9415728E38)
        L44:
            java.lang.String r6 = X.AbstractC2271BQs.A01(r14, r0)
            r0 = 2131890512(0x7f121150, float:1.9415718E38)
            java.lang.String r8 = X.AbstractC2271BQs.A01(r14, r0)
            com.facebook.aura.watchhandoff.WatchAppPromoNudge$content$1 r2 = new com.facebook.aura.watchhandoff.WatchAppPromoNudge$content$1
            r2.<init>(r4)
            r0 = -1336138342(0xffffffffb05c259a, float:-8.008897E-10)
            X.B1U r11 = X.B1V.A00(r14, r2, r0)
            com.facebook.aura.nudge.NudgePresentation r12 = r13.presentation
            if (r3 == 0) goto L7f
            r0 = -1445049623(0xffffffffa9de4ae9, float:-9.871775E-14)
            r14.AgE(r0)
            r0 = 2131886643(0x7f120233, float:1.940787E38)
            java.lang.String r13 = X.AbstractC2271BQs.A01(r14, r0)
            X.BBI r14 = (X.BBI) r14
            X.BBI.A0R(r14, r1)
        L71:
            r4 = 2131231383(0x7f080297, float:1.8078845E38)
            r7 = 2
            r9 = 3
            com.facebook.aura.nudge.NudgeContent r3 = new com.facebook.aura.nudge.NudgeContent
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.BBI.A0R(r14, r1)
            return r3
        L7f:
            r0 = -1846817953(0xffffffff91ebcb5f, float:-3.72018E-28)
            r14.AgE(r0)
            X.BBI r14 = (X.BBI) r14
            X.BBI.A0R(r14, r1)
            r13 = 0
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchhandoff.WatchAppPromoNudge.content(X.BFM, int):com.facebook.aura.nudge.NudgeContent");
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* bridge */ void Card(ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i, int i2) {
        ConversationNudge.CC.$default$Card(this, conversationCardControls, bRg, bfm, i, i2);
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* synthetic */ void Card(ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i) {
        ConversationNudge.CC.$default$Card(this, conversationCardControls, bRg, bfm, i);
    }
}
