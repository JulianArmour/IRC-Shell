package armour.julian.publisher;

/**
 * Publishes
 */
public class SocketPublisher implements Publisher {

  private HumbleSocket socket;

  public SocketPublisher(HumbleSocket socket) {
    this.socket = socket;
  }

  @Override
  public BrokerResponse publish(String channelName, String msg) {
    //todo
    return new BrokerResponse() {};
  }
}
