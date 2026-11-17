package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetData;
import com.facebook.aura.model.JSONState;
import com.facebook.aura.model.LocalMapWidgetData;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$HatchWidget$htmlMap$1 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ String $authToken;
    public final /* synthetic */ HatchWidgetData $data;
    public final /* synthetic */ String $gatewayBaseUrl;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
    public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ HatchWidget $widget;
    public final /* synthetic */ int $widthBucket;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationWidgetsKt$HatchWidget$htmlMap$1(HatchWidget hatchWidget, HatchWidgetData hatchWidgetData, int i, G0W<? super String, ? super String, ? super String, Unit> g0w, String str, String str2, String str3, G0U<? super String, Integer> g0u, G0V<? super String, ? super Integer, Unit> g0v) {
        super(3);
        this.$widget = hatchWidget;
        this.$data = hatchWidgetData;
        this.$widthBucket = i;
        this.$onWidgetSetState = g0w;
        this.$hostMessageId = str;
        this.$gatewayBaseUrl = str2;
        this.$authToken = str3;
        this.$onGetWidgetHeight = g0u;
        this.$onSetWidgetHeight = g0v;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BRg bRg, BFM bfm, int i) {
        int iA0d = i;
        if (AnonymousClass002.A0B(bRg, iA0d) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            HatchWidget hatchWidget = this.$widget;
            String str = hatchWidget.widgetId;
            String str2 = hatchWidget.kind;
            LocalMapWidgetData localMapWidgetData = (LocalMapWidgetData) this.$data;
            boolean zA1a = AnonymousClass001.A1a(AnonymousClass005.A1T(bfm, str2, localMapWidgetData.html, localMapWidgetData.path, bfm.A65(str)), bfm, this.$widthBucket);
            HatchWidget hatchWidget2 = this.$widget;
            HatchWidgetData hatchWidgetData = this.$data;
            int i2 = this.$widthBucket;
            Object objAaT = bfm.AaT();
            if (zA1a || objAaT == C78N.A00) {
                LocalMapWidgetData localMapWidgetData2 = (LocalMapWidgetData) hatchWidgetData;
                String str3 = localMapWidgetData2.path;
                if (str3 == null) {
                    str3 = localMapWidgetData2.html;
                }
                objAaT = HatchConversationWidgetsKt.heightCacheKey(hatchWidget2, str3, i2);
                bfm.Ai0(objAaT);
            }
            String str4 = (String) objAaT;
            HatchWidget hatchWidget3 = this.$widget;
            String str5 = hatchWidget3.widgetId;
            String str6 = hatchWidget3.kind;
            String str7 = ((LocalMapWidgetData) this.$data).html;
            JSONState jSONState = hatchWidget3.state;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$widget, AnonymousClass001.A1R(bfm, this.$hostMessageId, bfm.A65(this.$onWidgetSetState)));
            G0W<String, String, String, Unit> g0w = this.$onWidgetSetState;
            String str8 = this.$hostMessageId;
            HatchWidget hatchWidget4 = this.$widget;
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == C78N.A00) {
                objAaT2 = new HatchConversationWidgetsKt$HatchWidget$htmlMap$1$1$1(g0w, str8, hatchWidget4);
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            LocalMapWidgetData localMapWidgetData3 = (LocalMapWidgetData) this.$data;
            String str9 = localMapWidgetData3.path;
            if (str9 == null || localMapWidgetData3.html.length() != 0) {
                str9 = null;
            }
            String str10 = this.$gatewayBaseUrl;
            String str11 = this.$authToken;
            int iA0F = AnonymousClass001.A0F(this.$onGetWidgetHeight.invoke(str4));
            boolean zA1K = AnonymousClass003.A1K(bfm, this.$onSetWidgetHeight, str4);
            G0V<String, Integer, Unit> g0v = this.$onSetWidgetHeight;
            Object objAaT3 = bfm.AaT();
            if (zA1K || objAaT3 == C78N.A00) {
                objAaT3 = new HatchConversationWidgetsKt$HatchWidget$htmlMap$1$3$1(g0v, str4);
                bfm.Ai0(objAaT3);
            }
            HatchWidgetWebViewKt.m689HatchWidgetWebView0jEhg8(str5, str6, str7, jSONState, g0u, str9, str10, str11, iA0F, (G0U) objAaT3, null, null, bRg, bfm, JSONState.$stable << 9, (iA0d << 6) & 896, 3072);
            return;
        }
        bfm.Afo();
    }
}
