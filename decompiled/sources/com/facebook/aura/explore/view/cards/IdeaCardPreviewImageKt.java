package com.facebook.aura.explore.view.cards;

import X.ARL;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.B15;
import X.B18;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C2eL;
import X.C3Ue;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.CFK;
import X.Ejq;
import X.F13;
import X.G0V;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class IdeaCardPreviewImageKt {
    public static final String TAG = "IdeaCardPreviewImage";

    /* renamed from: IdeaCardPreviewImage-FV1VA1c, reason: not valid java name */
    public static final void m795IdeaCardPreviewImageFV1VA1c(String str, BRg bRg, int i, ARL arl, String str2, B6A b6a, BFM bfm, int i2, int i3) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> ideaCardPreviewImageKt$IdeaCardPreviewImage$3;
        final int i4 = i;
        String str3 = str2;
        B6A b6a2 = b6a;
        BRg bRg2 = bRg;
        ARL arl2 = arl;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(1705712871);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        int i5 = i3 & 2;
        if (i5 != 0) {
            iA0d |= 48;
        } else if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            iA0d |= 384;
        } else if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, i4);
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            iA0d |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, arl2);
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str3);
        }
        int i9 = i3 & 32;
        int iA0i = 196608;
        if (i9 != 0) {
            iA0d |= iA0i;
        } else if ((i2 & 196608) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, b6a2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 74899, 74898), bfm, iA0d)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            if (i6 != 0) {
                i4 = 0;
            }
            if (i7 != 0) {
                arl2 = B18.A00;
            }
            if (i8 != 0) {
                str3 = null;
            }
            if (i9 != 0) {
                b6a2 = null;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            int i10 = iA0d & 14;
            boolean zA1R = AnonymousClass001.A1R(bfm, abstractC3358CGzA0h, AnonymousClass003.A17(i10));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = IdeaPreviewImageUrlsKt.resolveIdeaPreviewImageUrl(str, abstractC3358CGzA0h, HatchThumbnailDisplaySize.MEDIUM);
                bfm.Ai0(objAaT);
            }
            final String str4 = (String) objAaT;
            if (str4 == null) {
                bfm.AgE(1134531660);
                boolean z = i10 == 4;
                Object objAaT2 = bfm.AaT();
                if (z || objAaT2 == C78N.A00) {
                    objAaT2 = new IdeaCardPreviewImageKt$IdeaCardPreviewImage$1$1(str);
                    bfm.Ai0(objAaT2);
                }
                AnonymousClass001.A17(bfm, objAaT2, str);
                C3Ue.A04(C06G.A0N(bfm, bRg2), bfm, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    ideaCardPreviewImageKt$IdeaCardPreviewImage$3 = new IdeaCardPreviewImageKt$IdeaCardPreviewImage$2(str, bRg2, i4, arl2, str3, b6a2, i2, i3);
                    bBbAAc.A06 = ideaCardPreviewImageKt$IdeaCardPreviewImage$3;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 1135191867);
            int i11 = iA0d & 896;
            boolean zA65 = bfm.A65(str4) | AnonymousClass003.A19(i11);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = B15.A00(Uri.parse(str4));
                bfm.Ai0(objAaT3);
            }
            Ejq ejq = (Ejq) objAaT3;
            boolean zA1H = AnonymousClass007.A1H(iA0d);
            Object objAaT4 = bfm.AaT();
            if (zA1H || objAaT4 == C78N.A00) {
                C7196Ei8 c7196Ei8 = new C7196Ei8(C7197Ei9.A0P);
                c7196Ei8.A0I = true;
                c7196Ei8.A0O = true;
                if (b6a2 != null) {
                    AuraImageKt.m2576auraTintColor4WTKRHQ(c7196Ei8, b6a2.A00);
                }
                objAaT4 = new C7197Ei9(c7196Ei8);
                bfm.Ai0(objAaT4);
            }
            C7197Ei9 c7197Ei9 = (C7197Ei9) objAaT4;
            boolean zA652 = (i11 == 256) | bfm.A65(str4);
            Object objAaT5 = bfm.AaT();
            if (zA652 || objAaT5 == C78N.A00) {
                objAaT5 = new F13() { // from class: com.facebook.aura.explore.view.cards.IdeaCardPreviewImageKt$IdeaCardPreviewImage$listener$1$1
                    @Override // X.F13, X.Ej6
                    public void onFailure(long j, Drawable drawable, Throwable th) {
                        String simpleName;
                        Long lValueOf = Long.valueOf(j);
                        Integer numValueOf = Integer.valueOf(i4);
                        String str5 = str4;
                        String str6 = "<null>";
                        if (th != null) {
                            simpleName = th.getClass().getSimpleName();
                            String message = th.getMessage();
                            if (message != null) {
                                str6 = message;
                            }
                        } else {
                            simpleName = "<null>";
                        }
                        CFK.A0H(IdeaCardPreviewImageKt.TAG, "failure id=%d retry=%d uri=%s errCls=%s msg=%s", lValueOf, numValueOf, str5, simpleName, str6);
                    }

                    @Override // X.F13, X.Ej6
                    public void onSubmit(long j, Object obj) {
                    }

                    @Override // X.F13, X.Ej6
                    public void onRelease(long j) {
                    }

                    @Override // X.F13, X.Ej6
                    public void onFinalImageSet(long j, int i12, C2eL c2eL, Drawable drawable) {
                    }
                };
                bfm.Ai0(objAaT5);
            }
            bfm.Ag8(-1487351290, bfm.APR(str4, Integer.valueOf(i4)));
            AuraImageKt.AuraImage(bRg2, ejq, str3, c7197Ei9, false, null, (F13) objAaT5, false, false, false, arl2, null, null, null, true, null, bfm, ((iA0d >> 3) & 14) | ((iA0d >> 6) & 896), ((iA0d >> 9) & 14) | RuntimeInternals.IOPRIO_BACKGROUND, 48048);
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            ideaCardPreviewImageKt$IdeaCardPreviewImage$3 = new IdeaCardPreviewImageKt$IdeaCardPreviewImage$3(str, bRg2, i4, arl2, str3, b6a2, i2, i3);
            bBbAAc.A06 = ideaCardPreviewImageKt$IdeaCardPreviewImage$3;
        }
    }
}
