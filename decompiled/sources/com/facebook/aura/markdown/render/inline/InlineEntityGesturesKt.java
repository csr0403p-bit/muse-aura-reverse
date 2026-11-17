package com.facebook.aura.markdown.render.inline;

import X.AbstractC1564Ale;
import X.BO6;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntityHandler;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class InlineEntityGesturesKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg inlineEntityGestures(X.BRg r14, kotlin.jvm.functions.Function0<X.C1958Aux> r15, X.ApQ r16, X.BO6<java.lang.String, com.facebook.aura.markdown.render.AuraMarkdownInlineEntityHandler> r17, X.BFM r18, int r19) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.inline.InlineEntityGesturesKt.inlineEntityGestures(X.BRg, kotlin.jvm.functions.Function0, X.ApQ, X.BO6, X.BFM, int):X.BRg");
    }

    public static final Unit inlineEntityGestures$lambda$8$0(List list, InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 1);
        AbstractC1564Ale.A0C(interfaceC0857A6e, list);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ BO6 access$inlineEntityGestures$lambda$3(C1BO c1bo) {
        return (BO6) c1bo.getValue();
    }

    public static final boolean inlineEntityGestures$lambda$7$0$0$0(InlineEntityActionLabels inlineEntityActionLabels, C1BO c1bo) {
        G0U<String, Unit> g0u;
        AuraMarkdownInlineEntityHandler auraMarkdownInlineEntityHandler = (AuraMarkdownInlineEntityHandler) ((Map) c1bo.getValue()).get(inlineEntityActionLabels.getInlineName());
        if (auraMarkdownInlineEntityHandler == null || (g0u = auraMarkdownInlineEntityHandler.onClick) == null) {
            return false;
        }
        g0u.invoke(inlineEntityActionLabels.key);
        return true;
    }

    public static final boolean inlineEntityGestures$lambda$7$0$0$1(InlineEntityActionLabels inlineEntityActionLabels, C1BO c1bo) {
        G0U<String, Unit> g0u;
        AuraMarkdownInlineEntityHandler auraMarkdownInlineEntityHandler = (AuraMarkdownInlineEntityHandler) ((Map) c1bo.getValue()).get(inlineEntityActionLabels.getInlineName());
        if (auraMarkdownInlineEntityHandler == null || (g0u = auraMarkdownInlineEntityHandler.onLongPress) == null) {
            return false;
        }
        g0u.invoke(inlineEntityActionLabels.key);
        return true;
    }
}
