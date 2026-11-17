package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.FiL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8660FiL extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ Alignment $alignment;
    public final /* synthetic */ boolean $applyOpacityToLayers;
    public final /* synthetic */ boolean $clipToCompositionBounds;
    public final /* synthetic */ C6837Eap $composition;
    public final /* synthetic */ ARL $contentScale;
    public final /* synthetic */ C8659FiK $drawable;
    public final /* synthetic */ C8661FiM $dynamicProperties;
    public final /* synthetic */ boolean $enableMergePaths;
    public final /* synthetic */ Map<String, Typeface> $fontMap;
    public final /* synthetic */ boolean $maintainOriginalImageBounds;
    public final /* synthetic */ Matrix $matrix;
    public final /* synthetic */ boolean $outlineMasksAndMattes;
    public final /* synthetic */ Function0<Float> $progress;
    public final /* synthetic */ B3A $renderMode;
    public final /* synthetic */ MutableState<C8661FiM> $setDynamicProperties$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Eap;LX/ARL;Landroidx/compose/ui/Alignment;Landroid/graphics/Matrix;LX/FiK;ZLX/B3A;Ljava/util/Map<Ljava/lang/String;+Landroid/graphics/Typeface;>;LX/FiM;ZZZZLkotlin/jvm/functions/Function0<Ljava/lang/Float;>;Landroidx/compose/runtime/MutableState<LX/FiM;>;)V */
    public C8660FiL(Matrix matrix, MutableState mutableState, Alignment alignment, ARL arl, C6837Eap c6837Eap, C8659FiK c8659FiK, B3A b3a, C8661FiM c8661FiM, Map map, Function0 function0, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(1);
        this.$composition = c6837Eap;
        this.$contentScale = arl;
        this.$alignment = alignment;
        this.$matrix = matrix;
        this.$drawable = c8659FiK;
        this.$enableMergePaths = z;
        this.$renderMode = b3a;
        this.$fontMap = map;
        this.$dynamicProperties = c8661FiM;
        this.$outlineMasksAndMattes = z2;
        this.$applyOpacityToLayers = z3;
        this.$maintainOriginalImageBounds = z4;
        this.$clipToCompositionBounds = z5;
        this.$progress = function0;
        this.$setDynamicProperties$delegate = mutableState;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        float f;
        float fMax;
        float f2;
        float fMin;
        AT3 at32 = at3;
        C7384Etj.A0Y(at32, 0);
        C6837Eap c6837Eap = this.$composition;
        ARL arl = this.$contentScale;
        Alignment alignment = this.$alignment;
        Matrix matrix = this.$matrix;
        C8659FiK c8659FiK = this.$drawable;
        boolean z = this.$enableMergePaths;
        B3A b3a = this.$renderMode;
        Map<String, Typeface> map = this.$fontMap;
        C8661FiM c8661FiM = this.$dynamicProperties;
        boolean z2 = this.$outlineMasksAndMattes;
        boolean z3 = this.$applyOpacityToLayers;
        boolean z4 = this.$maintainOriginalImageBounds;
        boolean z5 = this.$clipToCompositionBounds;
        Function0<Float> function0 = this.$progress;
        MutableState<C8661FiM> mutableState = this.$setDynamicProperties$delegate;
        InterfaceC1327AhE interfaceC1327AhE = ((AaI) at32.AEq()).A02.A02.A01;
        long jA00 = C1Wv.A00(c6837Eap.A05.width(), c6837Eap.A05.height());
        long jAKb = at32.AKb();
        long jA01 = (Ab3.A01(AWA.A00(jAKb)) & 4294967295L) | (Ab3.A01(AnonymousClass001.A00(jAKb)) << 32);
        long jA6j = arl.A6j(jA00, jAKb);
        float fA00 = AnonymousClass001.A00(jA00);
        float fA002 = AnonymousClass001.A00(jA6j);
        float fA003 = AWA.A00(jA00);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA6j & 4294967295L));
        long jA4F = alignment.A4F(at32.getLayoutDirection(), (((int) (fA003 * fIntBitsToFloat)) & 4294967295L) | (((int) (fA00 * fA002)) << 32), jA01);
        matrix.reset();
        matrix.preTranslate((int) (jA4F >> 32), C2ae.A00(jA4F));
        matrix.preScale(fA002, fIntBitsToFloat);
        if (c8659FiK.A0K != z) {
            c8659FiK.A0K = z;
            if (c8659FiK.A0C != null) {
                C8659FiK.A01(c8659FiK);
            }
        }
        c8659FiK.A0D = b3a;
        C8659FiK.A02(c8659FiK);
        if (c8659FiK.A0C != c6837Eap) {
            c8659FiK.A0M = true;
            ChoreographerFrameCallbackC8658FiI choreographerFrameCallbackC8658FiI = c8659FiK.A0R;
            if (choreographerFrameCallbackC8658FiI.A08) {
                choreographerFrameCallbackC8658FiI.cancel();
                if (!c8659FiK.isVisible()) {
                    c8659FiK.A0H = C79.A00;
                }
            }
            c8659FiK.A0C = null;
            c8659FiK.A0G = null;
            c8659FiK.A0F = null;
            choreographerFrameCallbackC8658FiI.A07 = null;
            choreographerFrameCallbackC8658FiI.A03 = -2.14748365E9f;
            choreographerFrameCallbackC8658FiI.A02 = 2.14748365E9f;
            c8659FiK.invalidateSelf();
            c8659FiK.A0C = c6837Eap;
            C8659FiK.A01(c8659FiK);
            boolean zA1Y = AnonymousClass002.A1Y(choreographerFrameCallbackC8658FiI.A07);
            choreographerFrameCallbackC8658FiI.A07 = c6837Eap;
            if (zA1Y) {
                float f3 = choreographerFrameCallbackC8658FiI.A03;
                f = c6837Eap.A03;
                fMax = Math.max(f3, f);
                float f4 = choreographerFrameCallbackC8658FiI.A02;
                f2 = c6837Eap.A00;
                fMin = Math.min(f4, f2);
            } else {
                f = c6837Eap.A03;
                fMax = (int) f;
                f2 = c6837Eap.A00;
                fMin = (int) f2;
            }
            if (fMax > fMin) {
                throw BV5.A0T("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(fMax), Float.valueOf(fMin)});
            }
            PointF pointF = AbstractC8699Fiz.A00;
            float fA01 = BV7.A01(f2, fMax, f);
            float fA012 = BV7.A01(f2, fMin, f);
            if (fA01 != choreographerFrameCallbackC8658FiI.A03 || fA012 != choreographerFrameCallbackC8658FiI.A02) {
                choreographerFrameCallbackC8658FiI.A03 = fA01;
                choreographerFrameCallbackC8658FiI.A02 = fA012;
                choreographerFrameCallbackC8658FiI.A05((int) BV7.A01(fA012, choreographerFrameCallbackC8658FiI.A00, fA01));
            }
            float f5 = choreographerFrameCallbackC8658FiI.A00;
            choreographerFrameCallbackC8658FiI.A00 = 0.0f;
            choreographerFrameCallbackC8658FiI.A01 = 0.0f;
            choreographerFrameCallbackC8658FiI.A05((int) f5);
            choreographerFrameCallbackC8658FiI.A04();
            c8659FiK.A05(choreographerFrameCallbackC8658FiI.getAnimatedFraction());
            ArrayList<FiT> arrayList = c8659FiK.A0T;
            Iterator itA0z = BV5.A0z(arrayList);
            while (itA0z.hasNext()) {
                FiT fiT = (FiT) itA0z.next();
                if (fiT != null) {
                    fiT.Abt();
                }
                itA0z.remove();
            }
            arrayList.clear();
            C8659FiK.A02(c8659FiK);
            Drawable.Callback callback = c8659FiK.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(c8659FiK);
            }
        }
        if (map != c8659FiK.A0I) {
            c8659FiK.A0I = map;
            c8659FiK.invalidateSelf();
        }
        if (c8661FiM != mutableState.getValue()) {
            C8661FiM value = mutableState.getValue();
            if (value != null) {
                for (C8664FiP<Integer> c8664FiP : value.A05) {
                    c8659FiK.A06(c8664FiP.A00, null, c8664FiP.A01);
                }
                for (C8664FiP<PointF> c8664FiP2 : value.A06) {
                    c8659FiK.A06(c8664FiP2.A00, null, c8664FiP2.A01);
                }
                for (C8664FiP<Float> c8664FiP3 : value.A03) {
                    c8659FiK.A06(c8664FiP3.A00, null, c8664FiP3.A01);
                }
                for (C8664FiP<C8770Fk9> c8664FiP4 : value.A07) {
                    c8659FiK.A06(c8664FiP4.A00, null, c8664FiP4.A01);
                }
                for (C8664FiP<ColorFilter> c8664FiP5 : value.A02) {
                    c8659FiK.A06(c8664FiP5.A00, null, c8664FiP5.A01);
                }
                for (C8664FiP<Object[]> c8664FiP6 : value.A04) {
                    c8659FiK.A06(c8664FiP6.A00, null, c8664FiP6.A01);
                }
                for (C8664FiP<Typeface> c8664FiP7 : value.A08) {
                    c8659FiK.A06(c8664FiP7.A00, null, c8664FiP7.A01);
                }
                for (C8664FiP<Bitmap> c8664FiP8 : value.A00) {
                    c8659FiK.A06(c8664FiP8.A00, null, c8664FiP8.A01);
                }
                for (C8664FiP<CharSequence> c8664FiP9 : value.A01) {
                    c8659FiK.A06(c8664FiP9.A00, null, c8664FiP9.A01);
                }
            }
            if (c8661FiM != null) {
                for (C8664FiP<Integer> c8664FiP10 : c8661FiM.A05) {
                    c8659FiK.A06(c8664FiP10.A00, new C8665FiQ(c8664FiP10.A02), c8664FiP10.A01);
                }
                for (C8664FiP<PointF> c8664FiP11 : c8661FiM.A06) {
                    c8659FiK.A06(c8664FiP11.A00, new C8665FiQ(c8664FiP11.A02), c8664FiP11.A01);
                }
                for (C8664FiP<Float> c8664FiP12 : c8661FiM.A03) {
                    c8659FiK.A06(c8664FiP12.A00, new C8665FiQ(c8664FiP12.A02), c8664FiP12.A01);
                }
                for (C8664FiP<C8770Fk9> c8664FiP13 : c8661FiM.A07) {
                    c8659FiK.A06(c8664FiP13.A00, new C8665FiQ(c8664FiP13.A02), c8664FiP13.A01);
                }
                for (C8664FiP<ColorFilter> c8664FiP14 : c8661FiM.A02) {
                    c8659FiK.A06(c8664FiP14.A00, new C8665FiQ(c8664FiP14.A02), c8664FiP14.A01);
                }
                for (C8664FiP<Object[]> c8664FiP15 : c8661FiM.A04) {
                    c8659FiK.A06(c8664FiP15.A00, new C8665FiQ(c8664FiP15.A02), c8664FiP15.A01);
                }
                for (C8664FiP<Typeface> c8664FiP16 : c8661FiM.A08) {
                    c8659FiK.A06(c8664FiP16.A00, new C8665FiQ(c8664FiP16.A02), c8664FiP16.A01);
                }
                for (C8664FiP<Bitmap> c8664FiP17 : c8661FiM.A00) {
                    c8659FiK.A06(c8664FiP17.A00, new C8665FiQ(c8664FiP17.A02), c8664FiP17.A01);
                }
                for (C8664FiP<CharSequence> c8664FiP18 : c8661FiM.A01) {
                    c8659FiK.A06(c8664FiP18.A00, new C8665FiQ(c8664FiP18.A02), c8664FiP18.A01);
                }
            }
            mutableState.Af8(c8661FiM);
        }
        if (c8659FiK.A0O != z2) {
            c8659FiK.A0O = z2;
            C8670FiW c8670FiW = c8659FiK.A0G;
            if (c8670FiW != null) {
                c8670FiW.A09(z2);
            }
        }
        c8659FiK.A0L = z3;
        c8659FiK.A0N = z4;
        if (z5 != c8659FiK.A0J) {
            c8659FiK.A0J = z5;
            C8670FiW c8670FiW2 = c8659FiK.A0G;
            if (c8670FiW2 != null) {
                c8670FiW2.A00 = z5;
            }
            c8659FiK.invalidateSelf();
        }
        c8659FiK.A05(AnonymousClass001.A02(function0.invoke()));
        c8659FiK.setBounds(0, 0, c6837Eap.A05.width(), c6837Eap.A05.height());
        Canvas canvasA00 = AbstractC1290Aga.A00(interfaceC1327AhE);
        C8670FiW c8670FiW3 = c8659FiK.A0G;
        C6837Eap c6837Eap2 = c8659FiK.A0C;
        if (c8670FiW3 != null && c6837Eap2 != null) {
            try {
                if (c8659FiK.A0P) {
                    canvasA00.save();
                    canvasA00.concat(matrix);
                    C8659FiK.A00(canvasA00, c8659FiK, c8670FiW3);
                    canvasA00.restore();
                } else {
                    c8670FiW3.A9E(canvasA00, matrix, c8659FiK.A00);
                }
                c8659FiK.A0M = false;
            } catch (InterruptedException unused) {
            }
        }
        return Unit.INSTANCE;
    }
}
