package armour.julian.publisher;

/**
 * An implementation of Publisher sends a message to some channel.
 */
public interface Publisher {

  BrokerResponse publish(String channelName, String msg);
}
