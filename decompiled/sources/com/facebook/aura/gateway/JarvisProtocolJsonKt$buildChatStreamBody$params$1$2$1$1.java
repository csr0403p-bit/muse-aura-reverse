package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.model.HatchAttachment;
import com.facebook.aura.model.HatchWidget;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class JarvisProtocolJsonKt$buildChatStreamBody$params$1$2$1$1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ HatchAttachment $att;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        String str;
        C7384Etj.A0Y(c2nw, 0);
        HatchAttachment hatchAttachment = this.$att;
        if (hatchAttachment.isWidget()) {
            C7qW.A06("type", "widget", c2nw);
            C7qW.A06("kind", "widget", c2nw);
            HatchWidget hatchWidget = this.$att.widget;
            if (hatchWidget == null || (str = hatchWidget.widgetId) == null) {
                return;
            }
            C7qW.A06("widget_id", str, c2nw);
            return;
        }
        if (hatchAttachment.uploadedPath != null) {
            C7qW.A06("type", "file_ref", c2nw);
            C7qW.A06(PhotosSearchHandlerKt.PARAM_MIME_TYPE, this.$att.mimeType, c2nw);
            C7qW.A06("path", this.$att.uploadedPath, c2nw);
        } else {
            C7qW.A06("type", hatchAttachment.getResolvedType(), c2nw);
            C7qW.A06(PhotosSearchHandlerKt.PARAM_MIME_TYPE, this.$att.mimeType, c2nw);
        }
        String str2 = this.$att.fileName;
        if (str2.length() > 0) {
            C7qW.A06("filename", str2, c2nw);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JarvisProtocolJsonKt$buildChatStreamBody$params$1$2$1$1(HatchAttachment hatchAttachment) {
        super(1);
        this.$att = hatchAttachment;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
