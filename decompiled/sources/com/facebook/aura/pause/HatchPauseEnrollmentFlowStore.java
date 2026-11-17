package com.facebook.aura.pause;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C06H;
import X.C20Q;
import X.C3UX;
import X.C6JO;
import X.C6JZ;
import X.C6O2;
import X.C7384Etj;
import X.C78T;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC7549F2g;
import android.util.Base64;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchPauseEnrollmentFlowStore implements InterfaceC7549F2g {
    public static final String PASSPHRASE_KEY_ALIAS = "htrk_6654c734ccab8f440ff0825eb443dc7f";
    public final C6JO<Preferences> dataStore;
    public final AbstractC3358CGz userSession;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;
    public static final C3UX processScope = C78T.A01(AnonymousClass001.A0y(), null);

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentFlowStore", f = "HatchPauseEnrollmentFlowStore.kt", l = {150}, m = "clear", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clear$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchPauseEnrollmentFlowStore.this.clear(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clear$2", f = "HatchPauseEnrollmentFlowStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clear$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C6O2, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hatchlingId;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = HatchPauseEnrollmentFlowStore.this.new AnonymousClass2(this.$hatchlingId, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C6O2 c6o2 = (C6O2) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            c6o2.A07(HatchPauseEnrollmentFlowStore.this.destinationKey(this.$hatchlingId));
            c6o2.A07(HatchPauseEnrollmentFlowStore.this.passphraseKey(this.$hatchlingId));
            c6o2.A07(HatchPauseEnrollmentFlowStore.this.enrollmentKey(this.$hatchlingId));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C6O2 c6o2, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c6o2, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentFlowStore", f = "HatchPauseEnrollmentFlowStore.kt", l = {158}, m = "clearTemporaryData", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clearTemporaryData$1, reason: invalid class name and case insensitive filesystem */
    public final class C134041 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C134041(HtJ<? super C134041> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchPauseEnrollmentFlowStore.this.clearTemporaryData(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clearTemporaryData$2", f = "HatchPauseEnrollmentFlowStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clearTemporaryData$2, reason: invalid class name and case insensitive filesystem */
    public final class C134052 extends AbstractC07127nr implements G0V<C6O2, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hatchlingId;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134052(String str, HtJ<? super C134052> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C134052 c134052 = HatchPauseEnrollmentFlowStore.this.new C134052(this.$hatchlingId, htJ);
            c134052.L$0 = obj;
            return c134052;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C6O2 c6o2 = (C6O2) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            c6o2.A07(HatchPauseEnrollmentFlowStore.this.destinationKey(this.$hatchlingId));
            c6o2.A07(HatchPauseEnrollmentFlowStore.this.passphraseKey(this.$hatchlingId));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C6O2 c6o2, HtJ<? super Unit> htJ) {
            return ((C134052) create(c6o2, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clearUserData$1", f = "HatchPauseEnrollmentFlowStore.kt", l = {165}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clearUserData$1, reason: invalid class name and case insensitive filesystem */
    public final class C134061 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clearUserData$1$1", f = "HatchPauseEnrollmentFlowStore.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clearUserData$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03351 extends AbstractC07127nr implements G0V<C6O2, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public C03351(HtJ<? super C03351> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C03351 c03351 = new C03351(htJ);
                c03351.L$0 = obj;
                return c03351;
            }

            @Override // X.G0V
            public final Object invoke(C6O2 c6o2, HtJ<? super Unit> htJ) {
                C03351 c03351 = new C03351(htJ);
                c03351.L$0 = c6o2;
                return c03351.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                C6O2 c6o2 = (C6O2) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                C6O2.A01(c6o2);
                c6o2.A00.clear();
                return Unit.INSTANCE;
            }
        }

        public C134061(HtJ<? super C134061> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPauseEnrollmentFlowStore.this.new C134061(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchPauseEnrollmentFlowStore.this.new C134061(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchPauseEnrollmentFlowStore hatchPauseEnrollmentFlowStore = HatchPauseEnrollmentFlowStore.this;
                int i2 = HatchPauseEnrollmentFlowStore.$stable;
                C6JO<Preferences> c6jo = hatchPauseEnrollmentFlowStore.dataStore;
                C03351 c03351 = new C03351(null);
                this.label = 1;
                if (C6JO.A00(c6jo, c03351, this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentFlowStore", f = "HatchPauseEnrollmentFlowStore.kt", l = {94}, m = "setDestination", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setDestination$1, reason: invalid class name and case insensitive filesystem */
    public final class C134071 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C134071(HtJ<? super C134071> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchPauseEnrollmentFlowStore.this.setDestination(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setDestination$2", f = "HatchPauseEnrollmentFlowStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setDestination$2, reason: invalid class name and case insensitive filesystem */
    public final class C134082 extends AbstractC07127nr implements G0V<C6O2, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $destinationKey;
        public final /* synthetic */ String $hatchlingId;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134082(String str, String str2, HtJ<? super C134082> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
            this.$destinationKey = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C134082 c134082 = HatchPauseEnrollmentFlowStore.this.new C134082(this.$hatchlingId, this.$destinationKey, htJ);
            c134082.L$0 = obj;
            return c134082;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C6O2 c6o2 = (C6O2) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            c6o2.A08(HatchPauseEnrollmentFlowStore.this.destinationKey(this.$hatchlingId), this.$destinationKey);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C6O2 c6o2, HtJ<? super Unit> htJ) {
            return ((C134082) create(c6o2, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentFlowStore", f = "HatchPauseEnrollmentFlowStore.kt", l = {146}, m = "setEnrollment", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setEnrollment$1, reason: invalid class name and case insensitive filesystem */
    public final class C134091 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C134091(HtJ<? super C134091> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchPauseEnrollmentFlowStore.this.setEnrollment(null, null, null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setEnrollment$2", f = "HatchPauseEnrollmentFlowStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setEnrollment$2, reason: invalid class name and case insensitive filesystem */
    public final class C134102 extends AbstractC07127nr implements G0V<C6O2, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hatchlingId;
        public final /* synthetic */ String $serialized;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134102(String str, String str2, HtJ<? super C134102> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
            this.$serialized = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C134102 c134102 = HatchPauseEnrollmentFlowStore.this.new C134102(this.$hatchlingId, this.$serialized, htJ);
            c134102.L$0 = obj;
            return c134102;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C6O2 c6o2 = (C6O2) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            c6o2.A08(HatchPauseEnrollmentFlowStore.this.enrollmentKey(this.$hatchlingId), this.$serialized);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C6O2 c6o2, HtJ<? super Unit> htJ) {
            return ((C134102) create(c6o2, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentFlowStore", f = "HatchPauseEnrollmentFlowStore.kt", l = {114}, m = "setPassphrase", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setPassphrase$1, reason: invalid class name and case insensitive filesystem */
    public final class C134111 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C134111(HtJ<? super C134111> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchPauseEnrollmentFlowStore.this.setPassphrase(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setPassphrase$2", f = "HatchPauseEnrollmentFlowStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setPassphrase$2, reason: invalid class name and case insensitive filesystem */
    public final class C134122 extends AbstractC07127nr implements G0V<C6O2, HtJ<? super Unit>, Object> {
        public final /* synthetic */ byte[] $encrypted;
        public final /* synthetic */ String $hatchlingId;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134122(String str, byte[] bArr, HtJ<? super C134122> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
            this.$encrypted = bArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C134122 c134122 = HatchPauseEnrollmentFlowStore.this.new C134122(this.$hatchlingId, this.$encrypted, htJ);
            c134122.L$0 = obj;
            return c134122;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C6O2 c6o2 = (C6O2) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            c6o2.A08(HatchPauseEnrollmentFlowStore.this.passphraseKey(this.$hatchlingId), Base64.encodeToString(this.$encrypted, 2));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C6O2 c6o2, HtJ<? super Unit> htJ) {
            return ((C134122) create(c6o2, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final C20Q<String> getDestination(String str) {
        C7384Etj.A0Y(str, 0);
        return new HatchPauseEnrollmentFlowStore$getDestination$$inlined$map$1(this.dataStore.AEa(), this, str);
    }

    public final C20Q<EnrollmentData> getEnrollment(String str) {
        C7384Etj.A0Y(str, 0);
        return new HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1(this.dataStore.AEa(), this, str);
    }

    public final C20Q<String> getPassphrase(String str) {
        C7384Etj.A0Y(str, 0);
        return new HatchPauseEnrollmentFlowStore$getPassphrase$$inlined$map$1(this.dataStore.AEa(), this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6JZ<String> destinationKey(String str) {
        return new C6JZ<>(FGI.A0M("destination_", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6JZ<String> enrollmentKey(String str) {
        return new C6JZ<>(FGI.A0M("enrollment_", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6JZ<String> passphraseKey(String str) {
        return new C6JZ<>(FGI.A0M("passphrase_", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clear(java.lang.String r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.AnonymousClass1
            if (r0 == 0) goto L39
            r5 = r8
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clear$1 r5 = (com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3f
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.6JO<androidx.datastore.preferences.core.Preferences> r2 = r6.dataStore
            r1 = 0
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clear$2 r0 = new com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clear$2
            r0.<init>(r7, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = X.C6JO.A00(r2, r0, r5)
            if (r0 != r4) goto L20
            return r4
        L39:
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clear$1 r5 = new com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clear$1
            r5.<init>(r8)
            goto L12
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.clear(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearTemporaryData(java.lang.String r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.C134041
            if (r0 == 0) goto L39
            r5 = r8
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clearTemporaryData$1 r5 = (com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.C134041) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3f
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.6JO<androidx.datastore.preferences.core.Preferences> r2 = r6.dataStore
            r1 = 0
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clearTemporaryData$2 r0 = new com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clearTemporaryData$2
            r0.<init>(r7, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = X.C6JO.A00(r2, r0, r5)
            if (r0 != r4) goto L20
            return r4
        L39:
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clearTemporaryData$1 r5 = new com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$clearTemporaryData$1
            r5.<init>(r8)
            goto L12
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.clearTemporaryData(java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        AnonymousClass001.A1J(new C134061(null), processScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setDestination(java.lang.String r7, java.lang.String r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.C134071
            if (r0 == 0) goto L3b
            r5 = r9
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setDestination$1 r5 = (com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.C134071) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L41
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.6JO<androidx.datastore.preferences.core.Preferences> r2 = r6.dataStore
            r1 = 0
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setDestination$2 r0 = new com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setDestination$2
            r0.<init>(r7, r8, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.label = r3
            java.lang.Object r0 = X.C6JO.A00(r2, r0, r5)
            if (r0 != r4) goto L20
            return r4
        L3b:
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setDestination$1 r5 = new com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setDestination$1
            r5.<init>(r9)
            goto L12
        L41:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.setDestination(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setEnrollment(java.lang.String r8, java.lang.String r9, byte[] r10, boolean r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.C134091
            if (r0 == 0) goto L56
            r5 = r12
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setEnrollment$1 r5 = (com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.C134091) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r6 = 1
            if (r0 == 0) goto L23
            if (r0 != r6) goto L5c
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.9sU r3 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.pause.EnrollmentDataJson$$serializer r2 = com.facebook.aura.pause.EnrollmentDataJson$$serializer.INSTANCE
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r10, r0)
            X.C7384Etj.A0U(r1)
            com.facebook.aura.pause.EnrollmentDataJson r0 = new com.facebook.aura.pause.EnrollmentDataJson
            r0.<init>(r9, r1, r11)
            java.lang.String r3 = r3.A02(r0, r2)
            X.6JO<androidx.datastore.preferences.core.Preferences> r2 = r7.dataStore
            r1 = 0
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setEnrollment$2 r0 = new com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setEnrollment$2
            r0.<init>(r8, r3, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.L$2 = r1
            r5.L$3 = r1
            r5.Z$0 = r11
            r5.label = r6
            java.lang.Object r0 = X.C6JO.A00(r2, r0, r5)
            if (r0 != r4) goto L20
            return r4
        L56:
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setEnrollment$1 r5 = new com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setEnrollment$1
            r5.<init>(r12)
            goto L12
        L5c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.setEnrollment(java.lang.String, java.lang.String, byte[], boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setPassphrase(java.lang.String r8, java.lang.String r9, X.HtJ<? super kotlin.Unit> r10) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.io.IOException, java.security.InvalidKeyException, java.security.KeyStoreException, java.security.cert.CertificateException {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.C134111
            if (r0 == 0) goto L49
            r6 = r10
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setPassphrase$1 r6 = (com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.C134111) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 != r4) goto L4f
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L23:
            X.Hwg.A00(r1)
            com.facebook.aura.hatchlockcrypto.HatchPassphraseEncryptor r2 = com.facebook.aura.hatchlockcrypto.HatchPassphraseEncryptor.INSTANCE
            byte[] r1 = X.C3cG.A1S(r9)
            java.lang.String r0 = "htrk_6654c734ccab8f440ff0825eb443dc7f"
            byte[] r3 = r2.encrypt(r0, r1)
            X.6JO<androidx.datastore.preferences.core.Preferences> r2 = r7.dataStore
            r1 = 0
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setPassphrase$2 r0 = new com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setPassphrase$2
            r0.<init>(r8, r3, r1)
            r6.L$0 = r1
            r6.L$1 = r1
            r6.L$2 = r1
            r6.label = r4
            java.lang.Object r0 = X.C6JO.A00(r2, r0, r6)
            if (r0 != r5) goto L20
            return r5
        L49:
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setPassphrase$1 r6 = new com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$setPassphrase$1
            r6.<init>(r10)
            goto L12
        L4f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.setPassphrase(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final HatchPauseEnrollmentFlowStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchPauseEnrollmentFlowStore) abstractC3358CGz.A03(HatchPauseEnrollmentFlowStore.class, new HatchPauseEnrollmentFlowStore$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchPauseEnrollmentFlowStore(AbstractC3358CGz abstractC3358CGz, C6JO c6jo, C06H c06h) {
        this(abstractC3358CGz, c6jo);
    }

    public HatchPauseEnrollmentFlowStore(AbstractC3358CGz abstractC3358CGz, C6JO<Preferences> c6jo) {
        this.userSession = abstractC3358CGz;
        this.dataStore = c6jo;
    }
}
