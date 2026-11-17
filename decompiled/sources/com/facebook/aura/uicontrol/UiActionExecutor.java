package com.facebook.aura.uicontrol;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes6.dex */
public final class UiActionExecutor {
    public static final UiActionExecutor INSTANCE = new UiActionExecutor();
    public static final Result.Unsupported GATED_OFF = new Result.Unsupported("This destination is not enabled on this client.", null);

    /* loaded from: classes2.dex */
    public interface Result {

        public final class Performed implements Result {
            public static final Performed INSTANCE = new Performed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Performed);
            }

            public String toString() {
                return "Performed";
            }

            public int hashCode() {
                return 1985202059;
            }
        }

        /* loaded from: classes6.dex */
        public final class Unsupported extends C06G implements Result {
            public final String errorCode;
            public final String reason;

            public Unsupported(String str, String str2) {
                C7384Etj.A0Y(str, 0);
                this.reason = str;
                this.errorCode = str2;
            }

            public final Unsupported copy(String str, String str2) {
                C7384Etj.A0Y(str, 0);
                return new Unsupported(str, str2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Unsupported) {
                        Unsupported unsupported = (Unsupported) obj;
                        if (!C7384Etj.areEqual(this.reason, unsupported.reason) || !C7384Etj.areEqual(this.errorCode, unsupported.errorCode)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Unsupported copy$default(Unsupported unsupported, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unsupported.reason;
                }
                if ((i & 2) != 0) {
                    str2 = unsupported.errorCode;
                }
                C7384Etj.A0Y(str, 0);
                return new Unsupported(str, str2);
            }

            public final String component1() {
                return this.reason;
            }

            public final String component2() {
                return this.errorCode;
            }

            public final String getErrorCode() {
                return this.errorCode;
            }

            public final String getReason() {
                return this.reason;
            }

            public int hashCode() {
                return AnonymousClass001.A0G(this.reason) + AnonymousClass006.A0G(this.errorCode);
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ Unsupported(String str, String str2, int i, C06H c06h) {
                this(str, (i & 2) != 0 ? null : str2);
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.uicontrol.UiActionExecutor", f = "UiActionExecutor.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures, 60}, m = "perform", v = 2)
    /* renamed from: com.facebook.aura.uicontrol.UiActionExecutor$perform$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UiActionExecutor.this.perform(null, null, null, null, this);
        }
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BackNavigationResult.values().length];
            try {
                AnonymousClass002.A13(BackNavigationResult.CLOSED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(BackNavigationResult.NOTHING_TO_CLOSE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(BackNavigationResult.COVERED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(BackNavigationResult.NOT_ON_SCREEN, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Result.Unsupported getGATED_OFF$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol() {
        return GATED_OFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object perform(com.facebook.aura.uicontrol.UiAction r8, X.AbstractC3358CGz r9, X.G0U<? super java.lang.String, kotlin.Unit> r10, X.G0U<? super java.lang.String, kotlin.Unit> r11, X.HtJ<? super com.facebook.aura.uicontrol.UiActionExecutor.Result> r12) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.uicontrol.UiActionExecutor.perform(com.facebook.aura.uicontrol.UiAction, X.CGz, X.G0U, X.G0U, X.HtJ):java.lang.Object");
    }
}
