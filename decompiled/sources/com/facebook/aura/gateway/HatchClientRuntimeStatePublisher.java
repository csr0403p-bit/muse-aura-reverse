package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C3UX;
import X.C3pU;
import X.C3rb;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.GDB;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.nodes.HatchNodeClient;
import com.facebook.aura.partners.voice.impl.VoiceClientVisibilityContributor;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class HatchClientRuntimeStatePublisher implements InterfaceC7549F2g {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchClientRuntimeState";
    public final Function0<Boolean> isCurrentSession;
    public final C1BN<Long> registrationEpoch;
    public final C3UX scope;
    public final G0V<HatchClientRuntimeStateRequestJson, HtJ<? super Boolean>, Object> send;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$1", f = "HatchClientRuntimeStatePublisher.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C20Q<Boolean> $visibility;
        public int label;
        public final /* synthetic */ HatchClientRuntimeStatePublisher this$0;

        @DebugMetadata(c = "com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$1$1", f = "HatchClientRuntimeStatePublisher.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01661 extends AbstractC07127nr implements G0W<Boolean, Long, HtJ<? super HxE<? extends Long, ? extends Boolean>>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;

            public C01661(HtJ<? super C01661> htJ) {
                super(3, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                Object obj2 = this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return AnonymousClass002.A0q(obj2, z);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Long l, HtJ<? super HxE<? extends Long, ? extends Boolean>> htJ) {
                return invoke(AnonymousClass001.A1X(bool), l, (HtJ<? super HxE<Long, Boolean>>) htJ);
            }

            public final Object invoke(boolean z, Long l, HtJ<? super HxE<Long, Boolean>> htJ) {
                C01661 c01661 = new C01661(htJ);
                c01661.Z$0 = z;
                c01661.L$0 = l;
                return c01661.invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$1$2", f = "HatchClientRuntimeStatePublisher.kt", l = {52}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<HxE<? extends Long, ? extends Boolean>, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public Object L$1;
            public boolean Z$0;
            public int label;
            public final /* synthetic */ HatchClientRuntimeStatePublisher this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchClientRuntimeStatePublisher hatchClientRuntimeStatePublisher, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.this$0 = hatchClientRuntimeStatePublisher;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, htJ);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(HxE<? extends Long, ? extends Boolean> hxE, HtJ<? super Unit> htJ) {
                return invoke2((HxE<Long, Boolean>) hxE, htJ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HxE hxE = (HxE) this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    Number number = (Number) hxE.first;
                    boolean zA1X = AnonymousClass001.A1X(hxE.second);
                    if (number != null) {
                        HatchClientRuntimeStatePublisher hatchClientRuntimeStatePublisher = this.this$0;
                        long jLongValue = number.longValue();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.Z$0 = zA1X;
                        this.label = 1;
                        if (hatchClientRuntimeStatePublisher.publish(jLongValue, zA1X, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(HxE<Long, Boolean> hxE, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(hxE, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C20Q<Boolean> c20q, HatchClientRuntimeStatePublisher hatchClientRuntimeStatePublisher, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$visibility = c20q;
            this.this$0 = hatchClientRuntimeStatePublisher;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$visibility, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q c20qA01 = GDB.A01(C3rb.A03(new C01661(null), this.$visibility, this.this$0.registrationEpoch));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (C3pU.A00(this, anonymousClass2, c20qA01) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchClientRuntimeStatePublisher", f = "HatchClientRuntimeStatePublisher.kt", l = {59, HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "publish", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$publish$1, reason: invalid class name and case insensitive filesystem */
    public final class C120541 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public long J$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C120541(HtJ<? super C120541> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchClientRuntimeStatePublisher.this.publish(0L, false, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchClientRuntimeStatePublisher(C1BN<Long> c1bn, C3UX c3ux, Function0<Boolean> function0, G0V<? super HatchClientRuntimeStateRequestJson, ? super HtJ<? super Boolean>, ? extends Object> g0v) {
        C7384Etj.A0Y(c1bn, 0);
        AnonymousClass005.A11(c3ux, function0, g0v, 1);
        this.registrationEpoch = c1bn;
        this.scope = c3ux;
        this.isCurrentSession = function0;
        this.send = g0v;
        List listSingletonList = Collections.singletonList(AuraAppLifecycleManager.isAppInForegroundImmediateFlow);
        ArrayList arrayList = new ArrayList(1);
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        arrayList.add(VoiceClientVisibilityContributor.INSTANCE.foregroundAllowed());
        C20Q c20qA01 = GDB.A01(new HatchClientRuntimeStatePublisher$special$$inlined$combine$1((C20Q[]) AbstractC0878AGe.A0X(AbstractC0878AGe.A0P(arrayList, listSingletonList)).toArray(new C20Q[0])));
        AnonymousClass001.A1J(new AnonymousClass1(c20qA01, this, null), this.scope);
    }

    public final class Companion {
        public final HatchClientRuntimeStatePublisher getInstance(AbstractC3358CGz abstractC3358CGz, HatchNodeClient hatchNodeClient) {
            AnonymousClass003.A0u(abstractC3358CGz, hatchNodeClient);
            return (HatchClientRuntimeStatePublisher) abstractC3358CGz.A03(HatchClientRuntimeStatePublisher.class, new HatchClientRuntimeStatePublisher$Companion$getInstance$1(hatchNodeClient, abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ae -> B:12:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publish(long r12, boolean r14, X.HtJ<? super kotlin.Unit> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.facebook.aura.gateway.HatchClientRuntimeStatePublisher.C120541
            if (r0 == 0) goto Lb7
            r8 = r15
            com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$publish$1 r8 = (com.facebook.aura.gateway.HatchClientRuntimeStatePublisher.C120541) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb7
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r1 = r8.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r8.label
            java.lang.String r7 = "HatchClientRuntimeState"
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L4f
            if (r0 == r5) goto L41
            if (r0 != r6) goto Lbe
            int r4 = r8.I$1
            int r3 = r8.I$0
            boolean r14 = r8.Z$0
            long r12 = r8.J$0
            X.Hwg.A00(r1)
        L2d:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L56
            java.lang.String r1 = "Published client visibility: foreground=%s"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            X.CFK.A03(r0, r7, r1)
        L3e:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
        L40:
            return r9
        L41:
            int r4 = r8.I$2
            int r0 = r8.I$1
            int r3 = r8.I$0
            boolean r14 = r8.Z$0
            long r12 = r8.J$0
            X.Hwg.A00(r1)
            goto L74
        L4f:
            X.Hwg.A00(r1)
            r3 = 3
            r4 = 0
        L54:
            r10 = r4
            goto L76
        L56:
            int r4 = r4 + 1
            if (r4 >= r3) goto Lb1
            if (r4 <= 0) goto L54
            int r2 = r4 + (-1)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 << r2
            r8.J$0 = r12
            r8.Z$0 = r14
            r8.I$0 = r3
            r8.I$1 = r4
            r8.I$2 = r4
            r8.label = r5
            java.lang.Object r0 = X.C7Bq.A01(r0, r8)
            if (r0 == r9) goto L40
            r0 = r4
        L74:
            r10 = r4
            r4 = r0
        L76:
            X.1BN<java.lang.Long> r0 = r11.registrationEpoch
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L3e
            long r1 = r0.longValue()
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 != 0) goto L3e
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r11.isCurrentSession
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3e
            X.HwK r2 = X.HwK.A00
            r1 = 0
            com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$publish$2$accepted$1 r0 = new com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$publish$2$accepted$1
            r0.<init>(r11, r14, r1)
            r8.J$0 = r12
            r8.Z$0 = r14
            r8.I$0 = r3
            r8.I$1 = r4
            r8.I$2 = r10
            r8.label = r6
            java.lang.Object r1 = X.GAo.A00(r8, r2, r0)
            if (r1 != r9) goto L2d
            return r9
        Lb1:
            java.lang.String r0 = "Client visibility could not be delivered"
            X.CFK.A06(r7, r0)
            goto L3e
        Lb7:
            com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$publish$1 r8 = new com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$publish$1
            r8.<init>(r15)
            goto L12
        Lbe:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchClientRuntimeStatePublisher.publish(long, boolean, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }
}
