package com.facebook.aura.sharesheet;

import X.AKL;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C3UX;
import X.C3cG;
import X.C78N;
import X.C7bA;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.aura.model.HatchFileProviderUtil;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ContentViewerScreenKey;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.SharedContentScreenKey;
import com.facebook.aura.navigation.key.SpaceTabScreenKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class HatchScreenshotShareEffectKt {
    public static final String TAG = "HatchScreenshotShare";

    /* renamed from: com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$HatchScreenshotShareEffect$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchScreenshotShareEffectKt.HatchScreenshotShareEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$HatchScreenshotShareEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchScreenshotShareEffectKt.HatchScreenshotShareEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$HatchScreenshotShareEffect$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchScreenshotShareEffectKt.HatchScreenshotShareEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt", f = "HatchScreenshotShareEffect.kt", l = {148, 151}, m = "captureScreenshot", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$captureScreenshot$1, reason: invalid class name and case insensitive filesystem */
    public final class C136691 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchScreenshotShareEffectKt.captureScreenshot(null, this);
        }

        public C136691(HtJ<? super C136691> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$captureScreenshot$2", f = "HatchScreenshotShareEffect.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$captureScreenshot$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C136702 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ Activity $activity;
        public final /* synthetic */ Bitmap $bitmap;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136702(Activity activity, Bitmap bitmap, HtJ<? super C136702> htJ) {
            super(2, htJ);
            this.$activity = activity;
            this.$bitmap = bitmap;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C136702(this.$activity, this.$bitmap, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return HatchFileProviderUtil.INSTANCE.getUriForFile(AnonymousClass001.A0I(this.$activity), new HatchShareMediaCache(AnonymousClass001.A0I(this.$activity)).storeNamed(AnonymousClass001.A0v(".png", C3cG.A0f(UUID.randomUUID(), "screenshot-")), new HatchScreenshotShareEffectKt$captureScreenshot$2$file$1(this.$bitmap))).toString();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((C136702) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt", f = "HatchScreenshotShareEffect.kt", l = {172}, m = "copyWindowPixels", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$copyWindowPixels$1, reason: invalid class name and case insensitive filesystem */
    public final class C136711 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchScreenshotShareEffectKt.copyWindowPixels(null, 0, 0, this);
        }

        public C136711(HtJ<? super C136711> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object captureScreenshot(android.app.Activity r8, X.HtJ<? super java.lang.String> r9) {
        /*
            boolean r0 = r9 instanceof com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt.C136691
            if (r0 == 0) goto L26
            r5 = r9
            com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$captureScreenshot$1 r5 = (com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt.C136691) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 2
            r7 = 1
            r3 = 0
            if (r0 == 0) goto L31
            if (r0 == r7) goto L7b
            if (r0 != r4) goto L2c
            java.lang.Object r7 = r5.L$2
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            goto La0
        L26:
            com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$captureScreenshot$1 r5 = new com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$captureScreenshot$1
            r5.<init>(r9)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r1)
            android.view.Window r0 = r8.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.flags
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 != 0) goto Lbe
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto Lbe
            boolean r0 = r8.isDestroyed()
            if (r0 != 0) goto Lbe
            android.view.Window r0 = r8.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.View r2 = r0.getRootView()
            int r0 = r2.getWidth()
            if (r0 <= 0) goto Lbe
            int r0 = r2.getHeight()
            if (r0 <= 0) goto Lbe
            int r1 = r2.getWidth()
            int r0 = r2.getHeight()
            r5.L$0 = r8
            r5.L$1 = r3
            r5.label = r7
            java.lang.Object r1 = copyWindowPixels(r8, r1, r0, r5)
            if (r1 != r6) goto L82
            return r6
        L7b:
            java.lang.Object r8 = r5.L$0
            android.app.Activity r8 = (android.app.Activity) r8
            X.Hwg.A00(r1)
        L82:
            r7 = r1
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 != 0) goto L88
            return r3
        L88:
            X.78T r1 = X.AnonymousClass001.A0y()     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb7 java.lang.Throwable -> Lb9
            com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$captureScreenshot$2 r0 = new com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$captureScreenshot$2     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb7 java.lang.Throwable -> Lb9
            r0.<init>(r8, r7, r3)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb7 java.lang.Throwable -> Lb9
            r5.L$0 = r3     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb7 java.lang.Throwable -> Lb9
            r5.L$1 = r3     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb7 java.lang.Throwable -> Lb9
            r5.L$2 = r7     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb7 java.lang.Throwable -> Lb9
            r5.label = r4     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb7 java.lang.Throwable -> Lb9
            java.lang.Object r1 = X.GAo.A00(r5, r1, r0)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb7 java.lang.Throwable -> Lb9
            if (r1 != r6) goto La3
            return r6
        La0:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb7 java.lang.Throwable -> Lb9
        La3:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb7 java.lang.Throwable -> Lb9
            r7.recycle()
            return r1
        La9:
            r2 = move-exception
            goto Lac
        Lab:
            r2 = move-exception
        Lac:
            java.lang.String r1 = "HatchScreenshotShare"
            java.lang.String r0 = "Failed to save screenshot"
            X.CFK.A0K(r1, r2, r0)     // Catch: java.lang.Throwable -> Lb9
            r7.recycle()
            return r3
        Lb7:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r0 = move-exception
            r7.recycle()
            throw r0
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt.captureScreenshot(android.app.Activity, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyWindowPixels(android.app.Activity r8, int r9, int r10, X.HtJ<? super android.graphics.Bitmap> r11) {
        /*
            boolean r0 = r11 instanceof com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt.C136711
            if (r0 == 0) goto L25
            r3 = r11
            com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$copyWindowPixels$1 r3 = (com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt.C136711) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r0 = r3.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r2 = r3.label
            r6 = 0
            java.lang.String r5 = "HatchScreenshotShare"
            r1 = 1
            if (r2 == 0) goto L30
            if (r2 != r1) goto L2b
            java.lang.Object r4 = r3.L$1
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            goto L61
        L25:
            com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$copyWindowPixels$1 r3 = new com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$copyWindowPixels$1
            r3.<init>(r11)
            goto L12
        L2b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L30:
            X.Hwg.A00(r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r9, r10, r0)
            X.C7384Etj.A0U(r4)
            r3.L$0 = r8     // Catch: java.lang.IllegalArgumentException -> L6c
            r3.L$1 = r4     // Catch: java.lang.IllegalArgumentException -> L6c
            r3.I$0 = r9     // Catch: java.lang.IllegalArgumentException -> L6c
            r3.I$1 = r10     // Catch: java.lang.IllegalArgumentException -> L6c
            r3.label = r1     // Catch: java.lang.IllegalArgumentException -> L6c
            X.GBL r3 = X.C7Bm.A04(r3)     // Catch: java.lang.IllegalArgumentException -> L6c
            android.view.Window r2 = r8.getWindow()     // Catch: java.lang.IllegalArgumentException -> L6c
            com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$copyWindowPixels$status$1$1 r1 = new com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$copyWindowPixels$status$1$1     // Catch: java.lang.IllegalArgumentException -> L6c
            r1.<init>()     // Catch: java.lang.IllegalArgumentException -> L6c
            android.os.Handler r0 = X.C60O.A02()     // Catch: java.lang.IllegalArgumentException -> L6c
            android.view.PixelCopy.request(r2, r4, r1, r0)     // Catch: java.lang.IllegalArgumentException -> L6c
            java.lang.Object r0 = r3.A0F()     // Catch: java.lang.IllegalArgumentException -> L6c
            if (r0 != r7) goto L64
            return r7
        L61:
            X.Hwg.A00(r0)     // Catch: java.lang.IllegalArgumentException -> L6c
        L64:
            int r0 = X.AnonymousClass001.A0F(r0)     // Catch: java.lang.IllegalArgumentException -> L6c
            if (r0 == 0) goto L6b
            goto L73
        L6b:
            return r4
        L6c:
            r1 = move-exception
            java.lang.String r0 = "Failed to capture screenshot"
            X.CFK.A0K(r5, r1, r0)
            goto L7c
        L73:
            java.lang.Object[] r1 = X.C60Q.A1Y(r0)
            java.lang.String r0 = "Screenshot copy failed with status %d"
            X.CFK.A0H(r5, r0, r1)
        L7c:
            r4.recycle()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt.copyWindowPixels(android.app.Activity, int, int, X.HtJ):java.lang.Object");
    }

    public static final boolean supportsScreenshotSharing(AuraNavKey auraNavKey) {
        return (auraNavKey instanceof ConversationTabScreenKey) || (auraNavKey instanceof ConversationScreenKey) || (auraNavKey instanceof ContentViewerScreenKey) || (auraNavKey instanceof SpaceTabScreenKey) || (auraNavKey instanceof SpacesModalScreenKey) || (auraNavKey instanceof SharedContentScreenKey);
    }

    public static final void HatchScreenshotShareEffect(BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass4;
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 140688616, i), bfm, i)) {
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            if (activity == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass4 = new HatchScreenshotShareEffectKt$HatchScreenshotShareEffect$activity$1(i);
                }
            } else if (Build.VERSION.SDK_INT < 34) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass4 = new AnonymousClass1(i);
                }
            } else if (HatchShareSheetMCKt.isHatchScreenshotShareEnabled()) {
                AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
                boolean zA1S = AnonymousClass005.A1S(bfm, auraNavigatorA0b, c3ux, activity);
                Object objAaT2 = bfm.AaT();
                if (zA1S || objAaT2 == obj) {
                    objAaT2 = new HatchScreenshotShareEffectKt$HatchScreenshotShareEffect$3$1(activity, auraNavigatorA0b, c3ux);
                    bfm.Ai0(objAaT2);
                }
                C7bA.A03(bfm, null, activity, auraNavigatorA0b, (G0U) objAaT2, 0, 4);
            } else {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass4 = new AnonymousClass2(i);
                }
            }
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(i);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }
}
