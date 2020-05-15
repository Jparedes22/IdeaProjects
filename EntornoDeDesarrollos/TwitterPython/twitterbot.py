import tweepy
import time
print('eyou eyou')


CONSUMER_KEY = '3wbN2BzmJutokLapzTAyNgTX9'
CONSUMER_SECRET = 'BqMTxODkGYaVfZy6eHsqztUg5SLgmCuRO8DYyMNRM1vblwUpft'
ACCESS_KEY = '1254920231774019584-O8xTg6NVcbTzt46XG7g1L27NxUOUcW'
ACCESS_SECRET = 'WksEhCQv3Qo3Nxg4H3JgObH5WIxBCnYfoOqNPYFHx6vlo'

auth = tweepy.OAuthHandler(CONSUMER_KEY, CONSUMER_SECRET)
auth.set_access_token(ACCESS_KEY, ACCESS_SECRET)
api = tweepy.API(auth)

FILE_NAME = 'last_seen_id.txt'

def retrieve_last_seen_id(file_name):
    f_read = open(file_name, 'r')
    last_seen_id = int(f_read.read().strip())
    f_read.close()
    return last_seen_id

def store_last_seen_id(last_seen_id, file_name):
    f_write = open(file_name, 'w')
    f_write.write(str(last_seen_id))
    f_write.close()
    return


def reply_to_tweets():
    print('buscando y contestando tuits...', flush=True)

    last_seen_id = retrieve_last_seen_id(FILE_NAME)

    mentions = api.mentions_timeline(
                        last_seen_id,
                        tweet_mode='extended')
    for mention in reversed(mentions):
        print(str(mention.id) + ' - ' + mention.full_text, flush=True)
        last_seen_id = mention.id
        store_last_seen_id(last_seen_id, FILE_NAME)
        if '#elbotdev' in mention.full_text.lower():
            print('se ha encontrado el hashtag #elbotdev', flush=True)
            print('constestando...', flush=True)
            api.update_status('Hola @' + mention.user.screen_name +
                    ' me alegra que utilices mi servicio de automatización, puedes seguir a mi creador @NeoSulkez #ElBotDev', mention.id)

        if '#elbotad' in mention.full_text.lower():
            print('se ha encontrado el hashtag #elbotad', flush=True)
            print('constestando...', flush=True)
            api.update_status('Hola @' + mention.user.screen_name +
                    ' ¿Interesado en  scripting y ciber seguridad? Prueba a entrar a la pagina jesusninoc.com #ElBotAd. ', mention.id)
        if '#elbotinfo' in mention.full_text.lower():
            print('se ha encontrado el hashtag #elbotinfo', flush=True)
            print('constestando...', flush=True)
            api.update_status('Hola @' + mention.user.screen_name +
                    ' soy un bot creado por @NeoSulkez usando Python, la librería Tweepy y el editor de texto Atom #ElBotInfo', mention.id)

while True:
    reply_to_tweets()
    time.sleep(15)
