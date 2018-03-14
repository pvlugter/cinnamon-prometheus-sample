package sample

import akka.actor._

object CinnamonPrometheusSample extends App {
  class Echo extends Actor {
    def receive = {
      case m =>
        Thread.sleep(1000)
        sender() ! m
      }
  }

  val system = ActorSystem("CinnamonPrometheusSample")
  val echo1 = system.actorOf(Props[Echo], "echo1")
  val echo2 = system.actorOf(Props[Echo], "echo2")

  echo1.tell("hello", echo2)
}
