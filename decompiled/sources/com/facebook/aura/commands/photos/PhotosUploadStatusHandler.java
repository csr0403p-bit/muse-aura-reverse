package com.facebook.aura.commands.photos;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.GAo;
import X.HtJ;
import android.content.Context;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class PhotosUploadStatusHandler implements HatchNodeCommandHandler {
    public static final PhotosUploadStatusHandler INSTANCE = new PhotosUploadStatusHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.photos.PhotosUploadStatusHandler$execute$2", f = "PhotosUploadStatusHandler.kt", l = {60, 68, 74, 75, HatchIdeaShareImageRenderer.TEXT_LEFT, HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX, 78, 91, 99, 106}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.photos.PhotosUploadStatusHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, NodeExecutionContext nodeExecutionContext, HatchNodeCommandContext hatchNodeCommandContext, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$paramsJson = str;
            this.$ctx = nodeExecutionContext;
            this.$commandContext = hatchNodeCommandContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$paramsJson, this.$ctx, this.$commandContext, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00eb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0104 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x011f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x013c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x016e A[Catch: Exception -> 0x022c, TryCatch #1 {Exception -> 0x022c, blocks: (B:64:0x0203, B:65:0x0206, B:55:0x01a4, B:56:0x01a7, B:57:0x01b5, B:59:0x01bb, B:60:0x01cd, B:61:0x01d5, B:46:0x013d, B:47:0x0140, B:50:0x0169, B:52:0x016e, B:42:0x0120, B:43:0x0123, B:38:0x0105, B:39:0x0108, B:34:0x00ec, B:35:0x00ef, B:30:0x00d5, B:31:0x00d8, B:27:0x00b6), top: B:84:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01bb A[Catch: Exception -> 0x022c, LOOP:0: B:57:0x01b5->B:59:0x01bb, LOOP_END, TryCatch #1 {Exception -> 0x022c, blocks: (B:64:0x0203, B:65:0x0206, B:55:0x01a4, B:56:0x01a7, B:57:0x01b5, B:59:0x01bb, B:60:0x01cd, B:61:0x01d5, B:46:0x013d, B:47:0x0140, B:50:0x0169, B:52:0x016e, B:42:0x0120, B:43:0x0123, B:38:0x0105, B:39:0x0108, B:34:0x00ec, B:35:0x00ef, B:30:0x00d5, B:31:0x00d8, B:27:0x00b6), top: B:84:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0202 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 686
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.photos.PhotosUploadStatusHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.PHOTOS_UPLOAD_STATUS;
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
        return PhotosCommandSpecs.PHOTOS_UPLOAD_STATUS;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public Object execute(AbstractC3358CGz abstractC3358CGz, HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, nodeExecutionContext, hatchNodeCommandContext, null));
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
