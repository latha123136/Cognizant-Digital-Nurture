public class DecoratorPatternTest {

    public static void main(String[] args) {

        Notifier notifier = new EmailNotifier();

        System.out.println("Email Only:");
        notifier.send("Meeting at 10 AM");

        System.out.println();

        Notifier smsNotifier =
                new SMSNotifierDecorator(new EmailNotifier());

        System.out.println("Email + SMS:");
        smsNotifier.send("Meeting at 11 AM");

        System.out.println();

        Notifier allNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        System.out.println("Email + SMS + Slack:");
        allNotifier.send("Meeting at 12 PM");

    }

}