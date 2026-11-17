package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C60Q;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.G0U;
import com.facebook.aura.spaces.repo.SpacesDataInvalidatedEvent;
import java.util.Iterator;
import kotlin.Unit;
import kotlinx.serialization.json.JsonArray;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$buildQueryInvalidationMessage$1$1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ SpacesDataInvalidatedEvent $event;

    /* renamed from: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$buildQueryInvalidationMessage$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
        public final /* synthetic */ SpacesDataInvalidatedEvent $event;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C7pd c7pd) {
            C7384Etj.A0Y(c7pd, 0);
            Iterator<JsonArray> it = this.$event.queryKeys.iterator();
            while (it.hasNext()) {
                c7pd.A06(C60Q.A11(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SpacesDataInvalidatedEvent spacesDataInvalidatedEvent) {
            super(1);
            this.$event = spacesDataInvalidatedEvent;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C7pd c7pd) {
            invoke2(c7pd);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        C7qW.A07("queryKeys", new AnonymousClass1(this.$event), c2nw);
        String str = this.$event.originActionCallId;
        if (str != null) {
            C7qW.A06("originActionCallId", str, c2nw);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$buildQueryInvalidationMessage$1$1(SpacesDataInvalidatedEvent spacesDataInvalidatedEvent) {
        super(1);
        this.$event = spacesDataInvalidatedEvent;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
