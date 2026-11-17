package com.facebook.acra.anr;

import X.AnonymousClass002;
import X.BV5;
import X.C3cH;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class StackTraceDumper {
    public static void dumpStackTraces(OutputStream outputStream) throws IOException {
        dumpStackTraces(outputStream, null, null);
    }

    public static void printThread(PrintWriter printWriter, Thread thread, StackTraceElement[] stackTraceElementArr) {
        printWriter.print(thread);
        printWriter.print(InviteCodeScratcherKt.CODE_SEPARATOR);
        printWriter.print(thread.getState());
        printWriter.println(":");
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            printWriter.println(stackTraceElement);
        }
        printWriter.println();
    }

    public static void dumpStackTraces(OutputStream outputStream, String str, String str2) throws IOException {
        PrintWriter printWriter = new PrintWriter(outputStream);
        if (str != null) {
            printWriter.println(str);
            printWriter.println(str2);
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Thread threadA0s = BV5.A0s();
        Iterator itA0n = AnonymousClass002.A0n(allStackTraces);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            printThread(printWriter, (Thread) entryA0l.getKey(), (StackTraceElement[]) entryA0l.getValue());
        }
        if (!allStackTraces.containsKey(threadA0s)) {
            printThread(printWriter, threadA0s, threadA0s.getStackTrace());
        }
        printWriter.flush();
    }
}
