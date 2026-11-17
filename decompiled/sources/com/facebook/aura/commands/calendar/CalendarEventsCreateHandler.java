package com.facebook.aura.commands.calendar;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.GAo;
import X.HtJ;
import android.content.Context;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class CalendarEventsCreateHandler implements HatchNodeCommandHandler {
    public static final CalendarEventsCreateHandler INSTANCE = new CalendarEventsCreateHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarEventsCreateHandler$execute$2", f = "CalendarEventsCreateHandler.kt", l = {103, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 124, 134, 148, 149, 153, 169, 185, AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN, 207, 226}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarEventsCreateHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public int I$0;
        public int I$1;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public boolean Z$0;
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

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0117, code lost:
        
            if (r12 != null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x01d5, code lost:
        
            if (X.C60Q.A0Y(r5, "events_json is required", "missing_params", null, r33) == r1) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00df A[Catch: Exception -> 0x035e, TryCatch #0 {Exception -> 0x035e, blocks: (B:25:0x0112, B:26:0x0115, B:28:0x0119, B:32:0x013b, B:34:0x013f, B:74:0x02aa, B:35:0x0160, B:60:0x023f, B:62:0x0249, B:78:0x02b9, B:65:0x0270, B:15:0x00a4, B:17:0x00d9, B:19:0x00df, B:21:0x00eb, B:97:0x0312, B:99:0x0318, B:100:0x0322, B:107:0x034d, B:67:0x0274, B:31:0x0138, B:73:0x02a7, B:59:0x023c, B:77:0x02b6, B:12:0x009e, B:16:0x00ca, B:106:0x034a), top: B:116:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x013f A[Catch: Exception -> 0x035e, TryCatch #0 {Exception -> 0x035e, blocks: (B:25:0x0112, B:26:0x0115, B:28:0x0119, B:32:0x013b, B:34:0x013f, B:74:0x02aa, B:35:0x0160, B:60:0x023f, B:62:0x0249, B:78:0x02b9, B:65:0x0270, B:15:0x00a4, B:17:0x00d9, B:19:0x00df, B:21:0x00eb, B:97:0x0312, B:99:0x0318, B:100:0x0322, B:107:0x034d, B:67:0x0274, B:31:0x0138, B:73:0x02a7, B:59:0x023c, B:77:0x02b6, B:12:0x009e, B:16:0x00ca, B:106:0x034a), top: B:116:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0222  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0249 A[Catch: Exception -> 0x035e, TryCatch #0 {Exception -> 0x035e, blocks: (B:25:0x0112, B:26:0x0115, B:28:0x0119, B:32:0x013b, B:34:0x013f, B:74:0x02aa, B:35:0x0160, B:60:0x023f, B:62:0x0249, B:78:0x02b9, B:65:0x0270, B:15:0x00a4, B:17:0x00d9, B:19:0x00df, B:21:0x00eb, B:97:0x0312, B:99:0x0318, B:100:0x0322, B:107:0x034d, B:67:0x0274, B:31:0x0138, B:73:0x02a7, B:59:0x023c, B:77:0x02b6, B:12:0x009e, B:16:0x00ca, B:106:0x034a), top: B:116:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0270 A[Catch: Exception -> 0x035e, TryCatch #0 {Exception -> 0x035e, blocks: (B:25:0x0112, B:26:0x0115, B:28:0x0119, B:32:0x013b, B:34:0x013f, B:74:0x02aa, B:35:0x0160, B:60:0x023f, B:62:0x0249, B:78:0x02b9, B:65:0x0270, B:15:0x00a4, B:17:0x00d9, B:19:0x00df, B:21:0x00eb, B:97:0x0312, B:99:0x0318, B:100:0x0322, B:107:0x034d, B:67:0x0274, B:31:0x0138, B:73:0x02a7, B:59:0x023c, B:77:0x02b6, B:12:0x009e, B:16:0x00ca, B:106:0x034a), top: B:116:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0312 A[Catch: Exception -> 0x035e, TRY_ENTER, TryCatch #0 {Exception -> 0x035e, blocks: (B:25:0x0112, B:26:0x0115, B:28:0x0119, B:32:0x013b, B:34:0x013f, B:74:0x02aa, B:35:0x0160, B:60:0x023f, B:62:0x0249, B:78:0x02b9, B:65:0x0270, B:15:0x00a4, B:17:0x00d9, B:19:0x00df, B:21:0x00eb, B:97:0x0312, B:99:0x0318, B:100:0x0322, B:107:0x034d, B:67:0x0274, B:31:0x0138, B:73:0x02a7, B:59:0x023c, B:77:0x02b6, B:12:0x009e, B:16:0x00ca, B:106:0x034a), top: B:116:0x000c }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x010e -> B:26:0x0115). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0110 -> B:28:0x0119). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                Method dump skipped, instructions count: 954
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarEventsCreateHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.CALENDAR_EVENTS_CREATE;
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
        return CalendarCommandSpecs.CALENDAR_EVENTS_CREATE;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public String validateParams(String str) {
        if (str == null) {
            return "events_json is required";
        }
        try {
            CalendarEventsCreateHandlerKt.parseCreateRequests(str);
            return null;
        } catch (IllegalArgumentException e) {
            String message = e.getMessage();
            return message == null ? "Invalid calendar event parameters" : message;
        }
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public Object execute(AbstractC3358CGz abstractC3358CGz, HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(hatchNodeCommandContext, str, nodeExecutionContext, null));
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ) {
        return null;
    }
}
