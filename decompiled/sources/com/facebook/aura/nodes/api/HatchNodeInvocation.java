package com.facebook.aura.nodes.api;

import X.AnonymousClass005;
import X.C7384Etj;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchNodeInvocation {
    public final String arguments;
    public final String command;
    public final long connectionGeneration;
    public final Context context;
    public final long deadlineElapsedMs;
    public final String id;
    public final Function0<Boolean> isConnectionCurrent;

    public final String getArguments() {
        return this.arguments;
    }

    public final String getCommand() {
        return this.command;
    }

    public final long getConnectionGeneration() {
        return this.connectionGeneration;
    }

    public final Context getContext() {
        return this.context;
    }

    public final long getDeadlineElapsedMs() {
        return this.deadlineElapsedMs;
    }

    public final String getId() {
        return this.id;
    }

    public final Function0<Boolean> isConnectionCurrent() {
        return this.isConnectionCurrent;
    }

    public HatchNodeInvocation(Context context, String str, String str2, String str3, long j, Function0<Boolean> function0, long j2) {
        AnonymousClass005.A0x(context, str, str2);
        C7384Etj.A0Y(function0, 5);
        this.context = context;
        this.command = str;
        this.id = str2;
        this.arguments = str3;
        this.deadlineElapsedMs = j;
        this.isConnectionCurrent = function0;
        this.connectionGeneration = j2;
    }
}
