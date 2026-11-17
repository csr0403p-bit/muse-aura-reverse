package com.facebook.aura.composer.camera;

import X.AFs;
import X.AbstractC07127nr;
import X.AbstractC0871AFr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C10543Hqv;
import X.C3UX;
import X.C7384Etj;
import X.CH0;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class HatchCameraCaptureState {
    public String filename;
    public String ownerId;
    public final MutableState pending$delegate;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;
    public static final AFs<HatchCameraCaptureState, Object> Saver = AbstractC0871AFr.A00(HatchCameraCaptureState$Companion$Saver$2.INSTANCE, HatchCameraCaptureState$Companion$Saver$1.INSTANCE);

    public final class Companion {
        public final AFs<HatchCameraCaptureState, Object> getSaver() {
            return HatchCameraCaptureState.Saver;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraCaptureState", f = "HatchCameraCaptureState.kt", l = {58, R.styleable.maplibre_MapView_maplibre_uiRotateGestures, 58, 58, 58}, m = MAHatchNativeAuthAppStartLoggerKt.STAGE_LAUNCH, v = 2)
    /* renamed from: com.facebook.aura.composer.camera.HatchCameraCaptureState$launch$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCameraCaptureState.this.launch(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraCaptureState$launch$2", f = "HatchCameraCaptureState.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.camera.HatchCameraCaptureState$launch$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C10543Hqv<File> $photo;
        public final /* synthetic */ AbstractC3358CGz $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C10543Hqv<File> c10543Hqv, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$photo = c10543Hqv;
            this.$session = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$photo, this.$session, htJ);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.io.File] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            this.$photo.element = HatchCameraFiles.INSTANCE.create$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(this.$session);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraCaptureState$launch$3", f = "HatchCameraCaptureState.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.camera.HatchCameraCaptureState$launch$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C10543Hqv<File> $photo;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C10543Hqv<File> c10543Hqv, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$photo = c10543Hqv;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$photo, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            File file = this.$photo.element;
            if (file == null) {
                return null;
            }
            HatchCameraFiles.INSTANCE.delete$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(file);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass3(this.$photo, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraCaptureState", f = "HatchCameraCaptureState.kt", l = {73, 87, 87, 87}, m = "takeResult", v = 2)
    /* renamed from: com.facebook.aura.composer.camera.HatchCameraCaptureState$takeResult$1, reason: invalid class name and case insensitive filesystem */
    public final class C111441 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public C111441(HtJ<? super C111441> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCameraCaptureState.this.takeResult(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraCaptureState$takeResult$2", f = "HatchCameraCaptureState.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.camera.HatchCameraCaptureState$takeResult$2, reason: invalid class name and case insensitive filesystem */
    public final class C111452 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Object>, Object> {
        public final /* synthetic */ boolean $belongsToSession;
        public final /* synthetic */ boolean $captured;
        public final /* synthetic */ String $name;
        public final /* synthetic */ C10543Hqv<File> $result;
        public final /* synthetic */ String $userId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111452(String str, String str2, boolean z, boolean z2, C10543Hqv<File> c10543Hqv, HtJ<? super C111452> htJ) {
            super(2, htJ);
            this.$userId = str;
            this.$name = str2;
            this.$captured = z;
            this.$belongsToSession = z2;
            this.$result = c10543Hqv;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C111452(this.$userId, this.$name, this.$captured, this.$belongsToSession, this.$result, htJ);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Object> htJ) {
            return invoke2(c3ux, (HtJ<Object>) htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [T, java.io.File] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchCameraFiles hatchCameraFiles = HatchCameraFiles.INSTANCE;
            ?? Resolve$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera = hatchCameraFiles.resolve$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(this.$userId, this.$name);
            hatchCameraFiles.revoke$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(Resolve$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera);
            if (!this.$captured || !this.$belongsToSession || !Resolve$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera.isFile() || Resolve$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera.length() <= 0) {
                return Boolean.valueOf(Resolve$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera.delete());
            }
            this.$result.element = Resolve$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera;
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<Object> htJ) {
            return ((C111452) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final boolean begin(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        if (MutableState.A0A(this.pending$delegate) || !AuraSessionManager.INSTANCE.isCurrentSession(abstractC3358CGz)) {
            return false;
        }
        this.ownerId = ((CH0) abstractC3358CGz).A01;
        setPending(true);
        return true;
    }

    public final boolean isCurrent(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return C7384Etj.areEqual(this.ownerId, ((CH0) abstractC3358CGz).A01) && AuraSessionManager.INSTANCE.isCurrentSession(abstractC3358CGz);
    }

    public final void reset() {
        setPending(false);
        this.ownerId = "";
        this.filename = "";
    }

    private final void setPending(boolean z) {
        MutableState.A09(z, this.pending$delegate);
    }

    public final boolean getPending() {
        return MutableState.A0A(this.pending$delegate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[Catch: all -> 0x009e, TryCatch #2 {all -> 0x009e, blocks: (B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007d, B:36:0x0095, B:37:0x009b), top: B:64:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[Catch: all -> 0x009e, TryCatch #2 {all -> 0x009e, blocks: (B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007d, B:36:0x0095, B:37:0x009b), top: B:64:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object launch(X.AbstractC3358CGz r12, X.G0U<? super android.net.Uri, kotlin.Unit> r13, X.HtJ<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.camera.HatchCameraCaptureState.launch(X.CGz, X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: all -> 0x00f6, TRY_LEAVE, TryCatch #4 {all -> 0x00f6, blocks: (B:35:0x008c, B:37:0x0094), top: B:76:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object takeResult(X.AbstractC3358CGz r15, boolean r16, X.HtJ<? super java.io.File> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.camera.HatchCameraCaptureState.takeResult(X.CGz, boolean, X.HtJ):java.lang.Object");
    }

    public HatchCameraCaptureState(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.ownerId = str;
        this.filename = str2;
        this.pending$delegate = AnonymousClass002.A0P(Boolean.valueOf(z));
    }

    public /* synthetic */ HatchCameraCaptureState(String str, String str2, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass005.A1O(i, z));
    }

    public HatchCameraCaptureState() {
        this("", "", false);
    }
}
