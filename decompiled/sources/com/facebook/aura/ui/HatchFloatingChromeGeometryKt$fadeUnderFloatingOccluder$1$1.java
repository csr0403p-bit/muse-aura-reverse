package com.facebook.aura.ui;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C10649I0t;
import X.C3UX;
import X.C3pU;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.ui.HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$1$1", f = "HatchFloatingChromeGeometry.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchFloatingChromeGeometry $geometry;
    public final /* synthetic */ Function0<Boolean> $handedOff;
    public final /* synthetic */ MutableState<Boolean> $measured$delegate;
    public final /* synthetic */ Object $owner;
    public final /* synthetic */ AT5<Float, AOW> $reveal;
    public int label;

    /* renamed from: com.facebook.aura.ui.HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ HatchFloatingChromeGeometry $geometry;
        public final /* synthetic */ Function0<Boolean> $handedOff;
        public final /* synthetic */ Object $owner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchFloatingChromeGeometry hatchFloatingChromeGeometry, Object obj, Function0<Boolean> function0) {
            super(0);
            this.$geometry = hatchFloatingChromeGeometry;
            this.$owner = obj;
            this.$handedOff = function0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke() {
            /*
                r2 = this;
                com.facebook.aura.ui.HatchFloatingChromeGeometry r1 = r2.$geometry
                java.lang.Object r0 = r2.$owner
                java.lang.Boolean r0 = r1.isUnderFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui(r0)
                if (r0 == 0) goto L1f
                kotlin.jvm.functions.Function0<java.lang.Boolean> r1 = r2.$handedOff
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L19
                boolean r1 = X.AnonymousClass003.A1Y(r1)
                r0 = 0
                if (r1 == 0) goto L1a
            L19:
                r0 = 1
            L1a:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L1f:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$1$1.AnonymousClass1.invoke():java.lang.Boolean");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ui.HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$1$1$2", f = "HatchFloatingChromeGeometry.kt", l = {115, 117}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ui.HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Boolean> $measured$delegate;
        public final /* synthetic */ AT5<Float, AOW> $reveal;
        public float F$0;
        public /* synthetic */ boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AT5<Float, AOW> at5, MutableState<Boolean> mutableState, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$reveal = at5;
            this.$measured$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$reveal, this.$measured$delegate, htJ);
            anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                float fA02 = AnonymousClass003.A02(z ? 1 : 0);
                boolean zA0A = MutableState.A0A((MutableState) this.$measured$delegate);
                AT5<Float, AOW> at5 = this.$reveal;
                if (zA0A) {
                    Float f = new Float(fA02);
                    ASj aSjA0K = AnonymousClass001.A0K(150, 0);
                    this.Z$0 = z;
                    this.F$0 = fA02;
                    this.label = 1;
                    if (AnonymousClass002.A0i(at5, aSjA0K, f, this, null) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    Float f2 = new Float(fA02);
                    this.Z$0 = z;
                    this.F$0 = fA02;
                    this.label = 2;
                    if (at5.A04(f2, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    MutableState.A09(true, this.$measured$delegate);
                }
            } else if (i == 1) {
                Hwg.A00(obj);
            } else {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                MutableState.A09(true, this.$measured$delegate);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$1$1(HatchFloatingChromeGeometry hatchFloatingChromeGeometry, Object obj, Function0<Boolean> function0, AT5<Float, AOW> at5, MutableState<Boolean> mutableState, HtJ<? super HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$1$1> htJ) {
        super(2, htJ);
        this.$geometry = hatchFloatingChromeGeometry;
        this.$owner = obj;
        this.$handedOff = function0;
        this.$reveal = at5;
        this.$measured$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$1$1(this.$geometry, this.$owner, this.$handedOff, this.$reveal, this.$measured$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C10649I0t c10649I0t = new C10649I0t(C6v3.A01(new AnonymousClass1(this.$geometry, this.$owner, this.$handedOff)), 2);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$reveal, this.$measured$delegate, null);
            this.label = 1;
            if (C3pU.A00(this, anonymousClass2, c10649I0t) == enumC10460Hji) {
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
        return ((HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
