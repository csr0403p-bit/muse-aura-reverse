package com.facebook.aura.spaces.view.cards;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C20Z;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.spaces.repo.SpacesUserError;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$14$1", f = "HtmlSpacesWebView.kt", l = {323}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$14$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $cameraPermissionMessage;
    public final /* synthetic */ String $pickerErrorMessage;
    public final /* synthetic */ HtmlSpacesWebViewSession $session;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$14$1(HtmlSpacesWebViewSession htmlSpacesWebViewSession, String str, String str2, HtJ<? super HtmlSpacesWebViewKt$HtmlSpacesWebView$14$1> htJ) {
        super(2, htJ);
        this.$session = htmlSpacesWebViewSession;
        this.$pickerErrorMessage = str;
        this.$cameraPermissionMessage = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HtmlSpacesWebViewKt$HtmlSpacesWebView$14$1(this.$session, this.$pickerErrorMessage, this.$cameraPermissionMessage, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C3Em<SpacesUserError> c3Em = this.$session.userErrors;
            final String str = this.$pickerErrorMessage;
            final String str2 = this.$cameraPermissionMessage;
            C20Z<? super SpacesUserError> c20z = new C20Z() { // from class: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$14$1.1

                /* renamed from: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$14$1$1$WhenMappings */
                public abstract /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[SpacesUserError.values().length];
                        try {
                            AnonymousClass002.A13(SpacesUserError.PICKER_FAILED, iArr);
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            AnonymousClass002.A14(SpacesUserError.CAMERA_PERMISSION_DENIED, iArr);
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public final Object emit(SpacesUserError spacesUserError, HtJ<? super Unit> htJ) {
                    String str3;
                    int iOrdinal = spacesUserError.ordinal();
                    if (iOrdinal == 0) {
                        str3 = str;
                    } else {
                        if (iOrdinal != 1) {
                            throw C3cG.A0q();
                        }
                        str3 = str2;
                    }
                    ToastApi.INSTANCE.showToast(str3);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((SpacesUserError) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c3Em.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HtmlSpacesWebViewKt$HtmlSpacesWebView$14$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
