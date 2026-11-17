package X;

import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes4.dex */
public final class AqZ extends CharacterStyle implements UpdateAppearance {
    public final C16b A00;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    @Override // android.text.style.CharacterStyle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateDrawState(android.text.TextPaint r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L11
            X.16b r2 = r2.A00
            X.16a r0 = X.C16a.A00
            boolean r0 = X.C7384Etj.areEqual(r2, r0)
            if (r0 == 0) goto L12
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r3.setStyle(r0)
        L11:
            return
        L12:
            boolean r0 = r2 instanceof X.AaJ
            if (r0 == 0) goto L5e
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r0)
            X.AaJ r2 = (X.AaJ) r2
            float r0 = r2.A01
            r3.setStrokeWidth(r0)
            float r0 = r2.A00
            r3.setStrokeMiter(r0)
            int r1 = r2.A03
            r0 = 0
            if (r1 != r0) goto L55
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
        L2e:
            r3.setStrokeJoin(r0)
            int r1 = r2.A02
            r0 = 0
            if (r1 == r0) goto L52
            r0 = 1
            if (r1 != r0) goto L4c
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
        L3b:
            r3.setStrokeCap(r0)
            X.0zF r0 = r2.A04
            if (r0 == 0) goto L4a
            X.Aqa r0 = (X.C1778Aqa) r0
            android.graphics.PathEffect r0 = r0.A00
        L46:
            r3.setPathEffect(r0)
            return
        L4a:
            r0 = 0
            goto L46
        L4c:
            r0 = 2
            if (r1 != r0) goto L52
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
            goto L3b
        L52:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            goto L3b
        L55:
            r0 = 1
            if (r1 != r0) goto L5b
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L2e
        L5b:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
            goto L2e
        L5e:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AqZ.updateDrawState(android.text.TextPaint):void");
    }

    public AqZ(C16b c16b) {
        this.A00 = c16b;
    }
}
