package com.facebook.aura.commands.photos;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7BY;
import X.C9oY;
import X.C9tI;
import X.C9tJ;
import X.G0V;
import X.GAo;
import X.HtJ;
import android.content.Context;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class PhotosSearchHandler implements HatchNodeCommandHandler {
    public static final PhotosSearchHandler INSTANCE = new PhotosSearchHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.photos.PhotosSearchHandler$execute$2", f = "PhotosSearchHandler.kt", l = {78, SelfieSnapshotKt.SELFIE_JPEG_QUALITY, MinidumpReader.MODULE_FULL_SIZE, 115, 127, 135, 141, 150, 166, 186, 196}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.photos.PhotosSearchHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public int I$0;
        public int I$1;
        public int I$2;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
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
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$commandContext, this.$paramsJson, this.$ctx, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0272  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0274 A[Catch: Exception -> 0x012f, TryCatch #0 {Exception -> 0x012f, blocks: (B:90:0x021c, B:92:0x0226, B:93:0x022a, B:95:0x0232, B:96:0x0236, B:102:0x0261, B:113:0x02a5, B:114:0x02a7, B:116:0x02db, B:118:0x02eb, B:120:0x0304, B:121:0x0309, B:122:0x0313, B:124:0x0319, B:125:0x0327, B:52:0x0110, B:55:0x0118, B:105:0x0274, B:109:0x029d, B:111:0x02a1, B:101:0x025e, B:108:0x029a, B:51:0x010d), top: B:138:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x02a1 A[Catch: Exception -> 0x012f, TryCatch #0 {Exception -> 0x012f, blocks: (B:90:0x021c, B:92:0x0226, B:93:0x022a, B:95:0x0232, B:96:0x0236, B:102:0x0261, B:113:0x02a5, B:114:0x02a7, B:116:0x02db, B:118:0x02eb, B:120:0x0304, B:121:0x0309, B:122:0x0313, B:124:0x0319, B:125:0x0327, B:52:0x0110, B:55:0x0118, B:105:0x0274, B:109:0x029d, B:111:0x02a1, B:101:0x025e, B:108:0x029a, B:51:0x010d), top: B:138:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:113:0x02a5 A[Catch: Exception -> 0x012f, PHI: r3 r7 r8 r13 r14
  0x02a5: PHI (r3v8 int) = (r3v27 int), (r3v28 int), (r3v29 int) binds: [B:110:0x029f, B:112:0x02a3, B:104:0x0272] A[DONT_GENERATE, DONT_INLINE]
  0x02a5: PHI (r7v10 com.facebook.aura.commands.photos.PhotoSearchPayload) = 
  (r7v3 com.facebook.aura.commands.photos.PhotoSearchPayload)
  (r7v3 com.facebook.aura.commands.photos.PhotoSearchPayload)
  (r7v12 com.facebook.aura.commands.photos.PhotoSearchPayload)
 binds: [B:110:0x029f, B:112:0x02a3, B:104:0x0272] A[DONT_GENERATE, DONT_INLINE]
  0x02a5: PHI (r8v7 com.facebook.aura.commands.photos.PhotoLabelScan) = 
  (r8v2 com.facebook.aura.commands.photos.PhotoLabelScan)
  (r8v2 com.facebook.aura.commands.photos.PhotoLabelScan)
  (r8v11 com.facebook.aura.commands.photos.PhotoLabelScan)
 binds: [B:110:0x029f, B:112:0x02a3, B:104:0x0272] A[DONT_GENERATE, DONT_INLINE]
  0x02a5: PHI (r13v7 int) = (r13v4 int), (r13v4 int), (r13v8 int) binds: [B:110:0x029f, B:112:0x02a3, B:104:0x0272] A[DONT_GENERATE, DONT_INLINE]
  0x02a5: PHI (r14v7 int) = (r14v4 int), (r14v4 int), (r14v8 int) binds: [B:110:0x029f, B:112:0x02a3, B:104:0x0272] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x012f, blocks: (B:90:0x021c, B:92:0x0226, B:93:0x022a, B:95:0x0232, B:96:0x0236, B:102:0x0261, B:113:0x02a5, B:114:0x02a7, B:116:0x02db, B:118:0x02eb, B:120:0x0304, B:121:0x0309, B:122:0x0313, B:124:0x0319, B:125:0x0327, B:52:0x0110, B:55:0x0118, B:105:0x0274, B:109:0x029d, B:111:0x02a1, B:101:0x025e, B:108:0x029a, B:51:0x010d), top: B:138:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x02db A[Catch: Exception -> 0x012f, TryCatch #0 {Exception -> 0x012f, blocks: (B:90:0x021c, B:92:0x0226, B:93:0x022a, B:95:0x0232, B:96:0x0236, B:102:0x0261, B:113:0x02a5, B:114:0x02a7, B:116:0x02db, B:118:0x02eb, B:120:0x0304, B:121:0x0309, B:122:0x0313, B:124:0x0319, B:125:0x0327, B:52:0x0110, B:55:0x0118, B:105:0x0274, B:109:0x029d, B:111:0x02a1, B:101:0x025e, B:108:0x029a, B:51:0x010d), top: B:138:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:118:0x02eb A[Catch: Exception -> 0x012f, TryCatch #0 {Exception -> 0x012f, blocks: (B:90:0x021c, B:92:0x0226, B:93:0x022a, B:95:0x0232, B:96:0x0236, B:102:0x0261, B:113:0x02a5, B:114:0x02a7, B:116:0x02db, B:118:0x02eb, B:120:0x0304, B:121:0x0309, B:122:0x0313, B:124:0x0319, B:125:0x0327, B:52:0x0110, B:55:0x0118, B:105:0x0274, B:109:0x029d, B:111:0x02a1, B:101:0x025e, B:108:0x029a, B:51:0x010d), top: B:138:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0319 A[Catch: Exception -> 0x012f, LOOP:0: B:122:0x0313->B:124:0x0319, LOOP_END, TryCatch #0 {Exception -> 0x012f, blocks: (B:90:0x021c, B:92:0x0226, B:93:0x022a, B:95:0x0232, B:96:0x0236, B:102:0x0261, B:113:0x02a5, B:114:0x02a7, B:116:0x02db, B:118:0x02eb, B:120:0x0304, B:121:0x0309, B:122:0x0313, B:124:0x0319, B:125:0x0327, B:52:0x0110, B:55:0x0118, B:105:0x0274, B:109:0x029d, B:111:0x02a1, B:101:0x025e, B:108:0x029a, B:51:0x010d), top: B:138:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x034f  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x015c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x018a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x021c A[Catch: Exception -> 0x012f, TRY_ENTER, TryCatch #0 {Exception -> 0x012f, blocks: (B:90:0x021c, B:92:0x0226, B:93:0x022a, B:95:0x0232, B:96:0x0236, B:102:0x0261, B:113:0x02a5, B:114:0x02a7, B:116:0x02db, B:118:0x02eb, B:120:0x0304, B:121:0x0309, B:122:0x0313, B:124:0x0319, B:125:0x0327, B:52:0x0110, B:55:0x0118, B:105:0x0274, B:109:0x029d, B:111:0x02a1, B:101:0x025e, B:108:0x029a, B:51:0x010d), top: B:138:0x000c }] */
        /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 902
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.photos.PhotosSearchHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.PHOTOS_SEARCH;
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
        return PhotosCommandSpecs.PHOTOS_SEARCH;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean booleanParam(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        Object obj = jsonObject.get(str);
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null) {
            Boolean boolA01 = C9oY.A01(jsonPrimitive);
            if (boolA01 != null) {
                return boolA01;
            }
            String strA04 = C9oY.A04(jsonPrimitive);
            if (strA04 != null) {
                return C7BY.A0E(strA04);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer intParam(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        Object obj = jsonObject.get(str);
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && (strA04 = C9oY.A04(jsonPrimitive)) != null) {
            Integer numA0r = C9tI.A0r(strA04);
            if (numA0r != null) {
                return numA0r;
            }
            Double dA0v = C9tJ.A0v(strA04);
            if (dA0v != null) {
                return Integer.valueOf((int) dA0v.doubleValue());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final List<String> stringListParam(JsonObject jsonObject, String str) {
        ?? A0i;
        JsonPrimitive jsonPrimitive;
        String strA04;
        String strA0l;
        Object objA1F = C60O.A1F(str, jsonObject);
        if (objA1F instanceof JsonArray) {
            A0i = C3cG.A0h();
            Iterator it = ((Iterable) objA1F).iterator();
            while (it.hasNext()) {
                JsonElement jsonElementA11 = C60Q.A11(it);
                if ((jsonElementA11 instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElementA11) != null && (strA04 = C9oY.A04(jsonPrimitive)) != null && (strA0l = AnonymousClass002.A0l(strA04)) != null) {
                    A0i.add(strA0l);
                }
            }
        } else if (objA1F instanceof JsonPrimitive) {
            String strA042 = C9oY.A04((JsonPrimitive) objA1F);
            if (strA042 == null) {
                strA042 = "";
            }
            List listA0h = C7BY.A0h(strA042, new char[1], ',');
            A0i = AnonymousClass003.A0i(listA0h);
            Iterator it2 = listA0h.iterator();
            while (it2.hasNext()) {
                A0i.add(C7BY.A0b(it2));
            }
        } else {
            A0i = C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it3 = A0i.iterator();
        while (it3.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it3);
        }
        return arrayListA0h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String stringParam(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        Object obj = jsonObject.get(str);
        if (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null || strA04.length() <= 0) {
            return null;
        }
        return strA04;
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
