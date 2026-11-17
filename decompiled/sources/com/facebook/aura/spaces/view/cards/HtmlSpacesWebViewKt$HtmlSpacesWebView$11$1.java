package com.facebook.aura.spaces.view.cards;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C6t6;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.spaces.repo.SpacesDataInvalidatedEvent;
import com.facebook.aura.spaces.repo.SpacesGatewayEvents;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObjectSerializer;

@DebugMetadata(c = "com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$11$1", f = "HtmlSpacesWebView.kt", l = {280}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$11$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $spaceSlug;
    public final /* synthetic */ SpacesGatewayEvents $spacesEvents;
    public final /* synthetic */ C6t6 $webView;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$11$1(SpacesGatewayEvents spacesGatewayEvents, String str, C6t6 c6t6, HtJ<? super HtmlSpacesWebViewKt$HtmlSpacesWebView$11$1> htJ) {
        super(2, htJ);
        this.$spacesEvents = spacesGatewayEvents;
        this.$spaceSlug = str;
        this.$webView = c6t6;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HtmlSpacesWebViewKt$HtmlSpacesWebView$11$1(this.$spacesEvents, this.$spaceSlug, this.$webView, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<SpacesDataInvalidatedEvent> c22i = this.$spacesEvents.dataInvalidated;
            final String str = this.$spaceSlug;
            final C6t6 c6t6 = this.$webView;
            C20Z<? super SpacesDataInvalidatedEvent> c20z = new C20Z() { // from class: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$11$1.1
                public final Object emit(SpacesDataInvalidatedEvent spacesDataInvalidatedEvent, HtJ<? super Unit> htJ) {
                    if (C7384Etj.areEqual(spacesDataInvalidatedEvent.slug, str)) {
                        c6t6.evaluateJavascript(FGI.A0U("window.postMessage(", HatchJsonKt.HatchJson.A02(HtmlSpacesWebViewKt.buildQueryInvalidationMessage(spacesDataInvalidatedEvent), JsonObjectSerializer.A01), ", '*');"), null);
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((SpacesDataInvalidatedEvent) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
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
        return ((HtmlSpacesWebViewKt$HtmlSpacesWebView$11$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
