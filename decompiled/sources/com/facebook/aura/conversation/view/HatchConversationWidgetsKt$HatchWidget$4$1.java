package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0V;
import X.G0W;
import com.facebook.aura.model.HatchMessageOrigin;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$HatchWidget$4$1 extends AbstractC7559F3s implements G0V<Integer, String, Unit> {
    public final /* synthetic */ G0V<String, HatchMessageOrigin, Unit> $handleAction;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ String $presentationMessageId;
    public final /* synthetic */ String $selectedText;
    public final /* synthetic */ HatchWidget $widget;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationWidgetsKt$HatchWidget$4$1(String str, G0W<? super String, ? super String, ? super String, Unit> g0w, String str2, HatchWidget hatchWidget, G0V<? super String, ? super HatchMessageOrigin, Unit> g0v, String str3) {
        super(2);
        this.$selectedText = str;
        this.$onWidgetSetState = g0w;
        this.$hostMessageId = str2;
        this.$widget = hatchWidget;
        this.$handleAction = g0v;
        this.$presentationMessageId = str3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str) {
        invoke(AnonymousClass001.A0F(num), str);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, String str) {
        C7384Etj.A0Y(str, 1);
        if (this.$selectedText == null) {
            G0W<String, String, String, Unit> g0w = this.$onWidgetSetState;
            if (g0w != null) {
                g0w.invoke(this.$hostMessageId, this.$widget.widgetId, HatchWidgetPresentationKt.optionSelectionStateJson(str));
            }
            G0V<String, HatchMessageOrigin, Unit> g0v = this.$handleAction;
            String str2 = this.$widget.widgetId;
            String str3 = this.$presentationMessageId;
            if (str3 == null) {
                str3 = this.$hostMessageId;
            }
            g0v.invoke(str, new HatchMessageOrigin(str2, str3, i, AnonymousClass002.A0k()));
        }
    }
}
