package com.facebook.aura.partners.voice.intf;

import X.A3q;
import X.AbstractC05623ug;
import X.AbstractC05643uj;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass603;
import X.BGK;
import X.BLG;
import X.C05663ul;
import X.C10650I0u;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3pU;
import X.C3rb;
import X.C7384Etj;
import X.C8fm;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.G2j;
import X.GDB;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.HyO;
import X.HzP;
import android.media.AudioManager;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class DeviceCallStateTracker {
    public static final int $stable = 0;
    public static final DeviceCallStateTracker INSTANCE = new DeviceCallStateTracker();
    public static final BLG<Set<Object>> audioModeOwners;
    public static final C20Q<Boolean> callUsesMediaOutputChanges;
    public static final C20Q<Boolean> isInCall;
    public static final BLG<Set<Object>> mediaOutputOwners;
    public static volatile long ownAudioModeReleasedAtMs;
    public static final BLG<Set<Object>> systemCallOwners;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$audioModeChanges$1", f = "DeviceCallStateTracker.kt", l = {115}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$audioModeChanges$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<HyO<? super Integer>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AudioManager $audioManager;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* renamed from: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$audioModeChanges$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02911 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ AudioManager $audioManager;
            public final /* synthetic */ AudioManager.OnModeChangedListener $listener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02911(AudioManager audioManager, AudioManager.OnModeChangedListener onModeChangedListener) {
                super(0);
                this.$audioManager = audioManager;
                this.$listener = onModeChangedListener;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$audioManager.removeOnModeChangedListener(this.$listener);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AudioManager audioManager, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$audioManager = audioManager;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$audioManager, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            final HyO hyO = (HyO) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AudioManager.OnModeChangedListener onModeChangedListener = new AudioManager.OnModeChangedListener() { // from class: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$audioModeChanges$1$listener$1
                    @Override // android.media.AudioManager.OnModeChangedListener
                    public final void onModeChanged(int i2) {
                        hyO.AhZ(Integer.valueOf(i2));
                    }
                };
                this.$audioManager.addOnModeChangedListener(AuraExecutors.INSTANCE.getUiThreadExecutor(), onModeChangedListener);
                hyO.AhZ(C3cG.A0R(this.$audioManager.getMode()));
                C02911 c02911 = new C02911(this.$audioManager, onModeChangedListener);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C8fm.A00(this, c02911, hyO) == enumC10460Hji) {
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
        public final Object invoke(HyO<? super Integer> hyO, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(hyO, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.DeviceCallStateTracker", f = "DeviceCallStateTracker.kt", l = {59, HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "awaitAudioModeReleased", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$awaitAudioModeReleased$1, reason: invalid class name and case insensitive filesystem */
    public final class C131331 extends HzP {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public C131331(HtJ<? super C131331> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceCallStateTracker.this.awaitAudioModeReleased(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$awaitAudioModeReleased$2", f = "DeviceCallStateTracker.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$awaitAudioModeReleased$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Set<? extends Object>, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Set set = (Set) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(set.isEmpty());
        }

        @Override // X.G0V
        public final Object invoke(Set<? extends Object> set, HtJ<? super Boolean> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = set;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$awaitAudioModeReleased$3", f = "DeviceCallStateTracker.kt", l = {HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$awaitAudioModeReleased$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$awaitAudioModeReleased$3$1", f = "DeviceCallStateTracker.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$awaitAudioModeReleased$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
                return anonymousClass1;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return C3cG.A0P(z);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass1) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<Boolean> c20q = DeviceCallStateTracker.isInCall;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, anonymousClass1, c20q);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$isInCall$1", f = "DeviceCallStateTracker.kt", l = {68, 73}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$isInCall$1, reason: invalid class name and case insensitive filesystem */
    public final class C131341 extends AbstractC07127nr implements G0V<C20Z<? super Boolean>, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$isInCall$1$1", f = "DeviceCallStateTracker.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$isInCall$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02921 extends AbstractC07127nr implements G2j<Integer, Set<? extends Object>, Set<? extends Object>, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ AudioManager $audioManager;
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02921(AudioManager audioManager, HtJ<? super C02921> htJ) {
                super(4, htJ);
                this.$audioManager = audioManager;
            }

            public final Object invoke(int i, Set<? extends Object> set, Set<? extends Object> set2, HtJ<? super Boolean> htJ) {
                C02921 c02921 = new C02921(this.$audioManager, htJ);
                c02921.L$0 = set;
                c02921.L$1 = set2;
                return c02921.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r4 = r5.L$0
                    java.util.Set r4 = (java.util.Set) r4
                    java.lang.Object r1 = r5.L$1
                    java.util.Set r1 = (java.util.Set) r1
                    int r0 = r5.label
                    if (r0 != 0) goto L2e
                    X.Hwg.A00(r6)
                    com.facebook.aura.partners.voice.intf.DeviceCallStateTracker r3 = com.facebook.aura.partners.voice.intf.DeviceCallStateTracker.INSTANCE
                    android.media.AudioManager r0 = r5.$audioManager
                    int r2 = r0.getMode()
                    boolean r0 = r4.isEmpty()
                    if (r0 == 0) goto L24
                    boolean r1 = r1.isEmpty()
                    r0 = 0
                    if (r1 != 0) goto L25
                L24:
                    r0 = 1
                L25:
                    boolean r0 = com.facebook.aura.partners.voice.intf.DeviceCallStateTracker.access$isInCallMode(r3, r2, r0)
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L2e:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker.C131341.C02921.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Set<? extends Object> set, Set<? extends Object> set2, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A0F(num), set, set2, htJ);
            }
        }

        public C131341(HtJ<? super C131341> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C131341 c131341 = new C131341(htJ);
            c131341.L$0 = obj;
            return c131341;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA01;
            C20Z c20z = (C20Z) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                DeviceCallStateTracker deviceCallStateTracker = DeviceCallStateTracker.INSTANCE;
                AudioManager audioManager = deviceCallStateTracker.getAudioManager();
                if (audioManager == null) {
                    Boolean boolA0h = AnonymousClass001.A0h();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    objA01 = c20z.emit(boolA0h, this);
                } else {
                    AnonymousClass603 anonymousClass603A00 = C3rb.A00(new C02921(audioManager, null), Build.VERSION.SDK_INT >= 31 ? deviceCallStateTracker.audioModeChanges(audioManager) : deviceCallStateTracker.pollAudioMode(audioManager), DeviceCallStateTracker.audioModeOwners, DeviceCallStateTracker.systemCallOwners);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    objA01 = C3pU.A01(this, anonymousClass603A00, c20z);
                }
                if (objA01 == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C20Z<? super Boolean> c20z, HtJ<? super Unit> htJ) {
            C131341 c131341 = new C131341(htJ);
            c131341.L$0 = c20z;
            return c131341.invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$isInCall$2", f = "DeviceCallStateTracker.kt", l = {82}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$isInCall$2, reason: invalid class name and case insensitive filesystem */
    public final class C131352 extends AbstractC07127nr implements G0W<C20Z<? super Boolean>, Throwable, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public C131352(HtJ<? super C131352> htJ) {
            super(3, htJ);
        }

        @Override // X.G0W
        public final Object invoke(C20Z<? super Boolean> c20z, Throwable th, HtJ<? super Unit> htJ) {
            C131352 c131352 = new C131352(htJ);
            c131352.L$0 = c20z;
            c131352.L$1 = th;
            return c131352.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C20Z c20z = (C20Z) this.L$0;
            Throwable th = (Throwable) this.L$1;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                CFK.A0A(DeviceCallStateTrackerKt.TAG, "Failed to read the audio mode", th);
                Boolean boolA0h = AnonymousClass001.A0h();
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (c20z.emit(boolA0h, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$pollAudioMode$1", f = "DeviceCallStateTracker.kt", l = {105, 106}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$pollAudioMode$1, reason: invalid class name and case insensitive filesystem */
    public final class C131361 extends AbstractC07127nr implements G0V<C20Z<? super Integer>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AudioManager $audioManager;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131361(AudioManager audioManager, HtJ<? super C131361> htJ) {
            super(2, htJ);
            this.$audioManager = audioManager;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C131361 c131361 = new C131361(this.$audioManager, htJ);
            c131361.L$0 = obj;
            return c131361;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003a -> B:9:0x0018). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r5 = r6.L$0
                X.20Z r5 = (X.C20Z) r5
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L15
                if (r0 == r2) goto L2d
                if (r0 == r3) goto L15
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L15:
                X.Hwg.A00(r7)
            L18:
                android.media.AudioManager r0 = r6.$audioManager
                int r0 = r0.getMode()
                java.lang.Integer r0 = X.C3cG.A0R(r0)
                r6.L$0 = r5
                r6.label = r2
                java.lang.Object r0 = r5.emit(r0, r6)
                if (r0 != r4) goto L30
                return r4
            L2d:
                X.Hwg.A00(r7)
            L30:
                r6.L$0 = r5
                r6.label = r3
                r0 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r0 = X.C7Bq.A01(r0, r6)
                if (r0 != r4) goto L18
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker.C131361.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C20Z<? super Integer> c20z, HtJ<? super Unit> htJ) {
            return ((C131361) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C20Q<Integer> audioModeChanges(AudioManager audioManager) {
        return AbstractC05643uj.A00(new AnonymousClass1(audioManager, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInCallMode(int i, boolean z) {
        if (i != 2) {
            return i == 3 && !z;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C20Q<Integer> pollAudioMode(AudioManager audioManager) {
        return new C05663ul(new C131361(audioManager, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInCallNow() {
        /*
            r6 = this;
            r5 = 0
            android.media.AudioManager r0 = r6.getAudioManager()     // Catch: java.lang.RuntimeException -> L30
            if (r0 == 0) goto L2f
            com.facebook.aura.partners.voice.intf.DeviceCallStateTracker r4 = com.facebook.aura.partners.voice.intf.DeviceCallStateTracker.INSTANCE     // Catch: java.lang.RuntimeException -> L30
            int r3 = r0.getMode()     // Catch: java.lang.RuntimeException -> L30
            X.BLG<java.util.Set<java.lang.Object>> r0 = com.facebook.aura.partners.voice.intf.DeviceCallStateTracker.audioModeOwners     // Catch: java.lang.RuntimeException -> L30
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.RuntimeException -> L30
            boolean r0 = X.C3cG.A1N(r0)     // Catch: java.lang.RuntimeException -> L30
            r2 = 1
            if (r0 == 0) goto L27
            X.BLG<java.util.Set<java.lang.Object>> r0 = com.facebook.aura.partners.voice.intf.DeviceCallStateTracker.systemCallOwners     // Catch: java.lang.RuntimeException -> L30
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.RuntimeException -> L30
            boolean r1 = X.C3cG.A1N(r0)     // Catch: java.lang.RuntimeException -> L30
            r0 = 0
            if (r1 != 0) goto L28
        L27:
            r0 = 1
        L28:
            boolean r0 = r4.isInCallMode(r3, r0)     // Catch: java.lang.RuntimeException -> L30
            if (r0 != r2) goto L2f
            return r2
        L2f:
            return r5
        L30:
            r2 = move-exception
            java.lang.String r1 = "Failed to read the audio mode"
            java.lang.String r0 = "DeviceCallStateTracker"
            X.CFK.A0A(r0, r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker.isInCallNow():boolean");
    }

    public final void setOwnsAudioMode(Object obj, boolean z) {
        Set<Object> value;
        Set<Object> set;
        C7384Etj.A0Y(obj, 0);
        if (!z) {
            ownAudioModeReleasedAtMs = SystemClock.elapsedRealtime();
        }
        BLG<Set<Object>> blg = audioModeOwners;
        do {
            value = blg.getValue();
            set = value;
        } while (!blg.A6e(value, z ? BGK.A02(obj, set) : BGK.A04(obj, set)));
    }

    public final void setOwnsSystemCall(Object obj, boolean z) {
        Set<Object> value;
        Set<Object> set;
        C7384Etj.A0Y(obj, 0);
        BLG<Set<Object>> blg = systemCallOwners;
        do {
            value = blg.getValue();
            set = value;
        } while (!blg.A6e(value, z ? BGK.A02(obj, set) : BGK.A04(obj, set)));
    }

    public final void setUsesMediaOutput(Object obj, boolean z) {
        Set<Object> value;
        Set<Object> set;
        C7384Etj.A0Y(obj, 0);
        BLG<Set<Object>> blg = mediaOutputOwners;
        do {
            value = blg.getValue();
            set = value;
        } while (!blg.A6e(value, z ? BGK.A02(obj, set) : BGK.A04(obj, set)));
    }

    static {
        A3q a3q = A3q.A00;
        audioModeOwners = HnJ.A01(a3q);
        systemCallOwners = HnJ.A01(a3q);
        C9286GCn c9286GCnA01 = HnJ.A01(a3q);
        mediaOutputOwners = c9286GCnA01;
        callUsesMediaOutputChanges = GDB.A01(new DeviceCallStateTracker$special$$inlined$map$1(c9286GCnA01));
        isInCall = AbstractC05623ug.A00(AnonymousClass001.A0y(), GDB.A01(new C10650I0u(2, new C131352(null), new C05663ul(new C131341(null)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitAudioModeReleased(X.HtJ<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.partners.voice.intf.DeviceCallStateTracker.C131331
            if (r0 == 0) goto L56
            r6 = r8
            com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$awaitAudioModeReleased$1 r6 = (com.facebook.aura.partners.voice.intf.DeviceCallStateTracker.C131331) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 0
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 == r2) goto L3a
            if (r0 != r4) goto L5c
            X.Hwg.A00(r1)
        L24:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L27:
            X.Hwg.A00(r1)
            X.BLG<java.util.Set<java.lang.Object>> r1 = com.facebook.aura.partners.voice.intf.DeviceCallStateTracker.audioModeOwners
            com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$awaitAudioModeReleased$2 r0 = new com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$awaitAudioModeReleased$2
            r0.<init>(r5)
            r6.label = r2
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r6, r0, r1)
            if (r0 != r7) goto L3d
            return r7
        L3a:
            X.Hwg.A00(r1)
        L3d:
            long r2 = com.facebook.aura.partners.voice.intf.DeviceCallStateTracker.ownAudioModeReleasedAtMs
            r0 = 2000(0x7d0, double:9.88E-321)
            long r2 = r2 + r0
            long r1 = X.C3cH.A04(r2)
            com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$awaitAudioModeReleased$3 r0 = new com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$awaitAudioModeReleased$3
            r0.<init>(r5)
            r6.J$0 = r1
            r6.label = r4
            java.lang.Object r0 = X.GAX.A01(r6, r0, r1)
            if (r0 != r7) goto L24
            return r7
        L56:
            com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$awaitAudioModeReleased$1 r6 = new com.facebook.aura.partners.voice.intf.DeviceCallStateTracker$awaitAudioModeReleased$1
            r6.<init>(r8)
            goto L12
        L5c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.intf.DeviceCallStateTracker.awaitAudioModeReleased(X.HtJ):java.lang.Object");
    }

    public final boolean getCallUsesMediaOutput() {
        return !C3cG.A1N(mediaOutputOwners.getValue());
    }

    public final C20Q<Boolean> getCallUsesMediaOutputChanges() {
        return callUsesMediaOutputChanges;
    }

    public final C20Q<Boolean> isInCall() {
        return isInCall;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AudioManager getAudioManager() {
        return (AudioManager) C3cG.A06().getSystemService(AudioManager.class);
    }
}
