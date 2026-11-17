package com.facebook.aura.commands.photos;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7BY;
import X.C9oY;
import X.C9tI;
import X.G0V;
import X.GAo;
import X.HtJ;
import android.content.Context;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class PhotosUploadHandler implements HatchNodeCommandHandler {
    public static final PhotosUploadHandler INSTANCE = new PhotosUploadHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.photos.PhotosUploadHandler$execute$2", f = "PhotosUploadHandler.kt", l = {63, MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS, 75, 80, 89, 98, 105}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.photos.PhotosUploadHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$commandContext = hatchNodeCommandContext;
            this.$paramsJson = str;
            this.$ctx = nodeExecutionContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$commandContext, this.$paramsJson, this.$ctx, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00d5 A[Catch: Exception -> 0x0127, TryCatch #1 {Exception -> 0x0127, blocks: (B:40:0x0110, B:41:0x0113, B:33:0x00cb, B:34:0x00ce, B:36:0x00d5, B:37:0x00da, B:30:0x00b2), top: B:56:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x010f A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 386
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.photos.PhotosUploadHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.PHOTOS_UPLOAD;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean getOnlySendsCard() {
        return false;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        return PhotosCommandSpecs.PHOTOS_UPLOAD;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final List<Long> longListParam(JsonObject jsonObject, String str) {
        ?? A0h;
        JsonPrimitive jsonPrimitive;
        String strA04;
        Long lA0s;
        Object objA1F = C60O.A1F(str, jsonObject);
        if (objA1F instanceof JsonArray) {
            A0h = C3cG.A0h();
            Iterator it = ((Iterable) objA1F).iterator();
            while (it.hasNext()) {
                JsonElement jsonElementA11 = C60Q.A11(it);
                if ((jsonElementA11 instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElementA11) != null && (strA04 = C9oY.A04(jsonPrimitive)) != null && (lA0s = C9tI.A0s(strA04)) != null) {
                    A0h.add(lA0s);
                }
            }
        } else if (objA1F instanceof JsonPrimitive) {
            String strA042 = C9oY.A04((JsonPrimitive) objA1F);
            if (strA042 == null) {
                strA042 = "";
            }
            List listA0h = C7BY.A0h(strA042, new char[1], ',');
            A0h = C3cG.A0h();
            Iterator it2 = listA0h.iterator();
            while (it2.hasNext()) {
                Long lA0s2 = C9tI.A0s(C7BY.A0b(it2));
                if (lA0s2 != null) {
                    A0h.add(lA0s2);
                }
            }
        } else {
            A0h = C0881AGi.A00;
        }
        return AbstractC0878AGe.A0T(A0h);
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public Object execute(AbstractC3358CGz abstractC3358CGz, HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(hatchNodeCommandContext, str, nodeExecutionContext, null));
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public boolean isEnabled() {
        return PhotosCommandSpecsKt.isNodesMediaEnabled();
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ) {
        return null;
    }
}
